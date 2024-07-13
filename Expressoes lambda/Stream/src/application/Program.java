package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		
		//Criar uma stream apartir de uma lista
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		
		//aplicando um map com função no stream
		Stream<Integer> st2 = list.stream().map(x -> x *10);
		System.out.println(Arrays.toString(st2.toArray()));
		
		// criando uma Stream que permite passar elementos na stream
		Stream<String> st3 = Stream.of("Maria", "Bob", "Alex");
		System.out.println(Arrays.toString(st3.toArray()));
		
		//Criando uma stream potencialmente infinita e passando um limite para ela
		Stream<Integer> st4 = Stream.iterate(0, x-> x+2);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
		//Sequencia de fibonaci com stream 
		Stream<Long> st5 = Stream.iterate(new Long[] {0L, 1L}, x -> new Long[] {x[1], x[0]+x[1]}).map(x -> x[0]);
	
		System.out.println(Arrays.toString(st5.limit(20).toArray()));
	}
}
