package animal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Trong method main() thực hiện tạo đối tượng Dog và Cat với các giá trị khác nhau và hiển thị các thuộc tính của chúng.
		Dog dog = new Dog("Vang", 3, "Viet Nam", "Nau", 6);
		dog.displayDog();
		Cat cat = new Cat("Miu", 1, "My", "Trang", 9);
		cat.displayCat();
	}
}