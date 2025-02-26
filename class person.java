class person{
        String name;
	int age;
	public person (String name, int age) {
		 this.name=name;
		 this.age=age;
		 
	}
        public void displayPerson(){
	      System.out.println("Name: "+ name);
	      System.out.println("Age:" +age);
        }


       public static void main(String[] args) {
		Person person = new Person ("Keerthana ", 18);
		person.displayPerson();
	}
}