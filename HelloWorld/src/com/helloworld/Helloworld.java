package com.helloworld;

/*public class Helloworld {

	public static void main(String[] args){
		System.out.println("HelloWorld");
	}*/

	public class Helloworld {
		  public static void main(String[] args) {
		    int スコア = 40;   //(1)
		    char グレード;

		    if (スコア >= 90) {   //(2)
		      グレード='A';
		    } else if (スコア >= 70) {   //(3)
		      グレード='B';
		    } else if (スコア >= 50) {
		      グレード='C';
		    } else {
		      グレード='D';
		    }

		    System.out.println("あなたは" + グレード + "判定です。");  //(4)
		  }
		}


