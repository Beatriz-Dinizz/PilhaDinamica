package controller;

import java.util.Stack;

public class FatController {

	public int fatorial(int num) {
		Stack<Integer> pilha = new Stack<>();
		
		for(int i = 1; i <= num; i++) {
			pilha.push(i);
		}
		
		int resultado = 1;
		
		while(!pilha.isEmpty()) {
			resultado *= pilha.pop();
		}
		
		return resultado;		
	}
}
