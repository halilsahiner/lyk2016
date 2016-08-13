package oop;

public abstract class Animal {
	
	protected String name;
	
	public Animal(){
		this.name = "hayvan"; //parametre almadigi icin this koymayadabilirdik.
	}
	
	public Animal(String name){
		
		this.name = name;
	}
	
	public void eatt(){
		System.out.println(this.name + " eatt");
	}
	
	public abstract void breath();
	
	public abstract void eat();
	
	public abstract void sleep();  
	// bunlar neden abstract. abstract olmasa mesela eatt gibi olsa animal test'te direkt cagirabilirdik
	// ama şimdi animal testte cagiramiyoruz.
	// onun yerine her hayvanın kendi class'ında fonksiyon oluşturuyosun aslında saçma gibi
	// çünkü her hayvan uyuyo aslında eatt gibi yapsak daha mantıklı. ama burada böyle yaptık. 
	

}

/*	curnivore ayrı bir şey. hiyeraşi dışında. tanımlamak için interface kullanıyorsun. hiyerarşi dışında olmak zorunda çünkü memeli
 *  sinifinin altına curnivore diye class yapsan mesela. memeli sınıfının altındaki tüm hayvanlar curnivore olmak zorunda değil. 
 *  yılan curnivore ama owl herbivor mesela.
 *  almak icinde kullanacagin sinifa dog, cat örnegin. implements Curnivore diyorsun. 
 *  super(name) ile her seferinde this.name yapmak yerine super(name) yazıyorsun. ve en üst sınıfa(animal) gidip onun this.name'iyle
 *  yazdırabiliyor ismini. extends Animal demen lazım tabii ki bunu kullanmak için.
 *  abstract te de animal sınıfını kullanmayı engelliyosun gibi bir şey. çünkü animal diye bir hayvan olamaz mesela.
 *  abstract obje oluşumunu engeller. Cat cat2 oluşturabiliyosun mesela. Ama Mammal mamal oluşturamazsın.
 *  */
