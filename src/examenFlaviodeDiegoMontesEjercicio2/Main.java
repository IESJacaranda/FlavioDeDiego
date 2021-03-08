package ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		
		
		String a="murcielago";
		String b="lagolago";
		
		System.out.println(StringUtil.compruebaCadena(a, b));
		
		
		String c="murcielago";
		String d="laago ";
		
		System.out.println(StringUtil.compruebaCadena(c, d));
		
		
		String e="   murcielago   ";
		String f="lago ";
		
		System.out.println(StringUtil.compruebaCadena(e,f));
		
		
		
		String h="mulagorcielago";
		String k="lago";
		
		System.out.println(StringUtil.compruebaCadena(h, k));
		
		
		String u="lago";
		String o="mulagorcielago";
		
		
		System.out.println(StringUtil.compruebaCadena(u,o));
		
		String uu="lago";
		String ll="lago";
		
		
		System.out.println(StringUtil.compruebaCadena(uu,ll));
	}

}
