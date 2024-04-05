package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.println("Iniciando...");
		String caminhoDoArquivo = "/home/thiagolinux/Downloads/input.csv";

		File criarArquivo = new File(caminhoDoArquivo);
		String caminhoPastaSaida = criarArquivo.getParent();

		boolean sucesso = new File(caminhoPastaSaida + "/out").mkdir();

		String arquivoDeSaida = caminhoPastaSaida + "/out/summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo))) {

			String arquivoLido = br.readLine();

			while (arquivoLido != null) {

				String[] vetor = arquivoLido.split(",");
				arquivoLido = br.readLine();

				String nome = vetor[0];
				double valor = Double.parseDouble(vetor[1]);
				int quantidade = Integer.parseInt(vetor[2]);

				Product product = new Product(nome, valor, quantidade);

				list.add(product);

			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDeSaida))) {

				for (Product product : list) {

					bw.write(product.getName() + ", " + String.format("%.2f", product.sum()));
					bw.newLine();

				}

				System.out.println("Criado!");
			}

		}

		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		finally { 
			
			sc.close();
			System.out.println("Finalizado!");
			
		}

	}

}
