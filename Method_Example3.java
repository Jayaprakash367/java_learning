package OOPs_Concept;
public class Method_Example3 {

	public static void main(String[] args) {
	Cse.Firstyear();
	IT.Firstyear();
	}}
class Cse{
		public static void Firstyear() {
			System.out.println("This is first Year");
			Secondyear();
		}
	      public static void Secondyear() {
			System.out.println("This is Second Year");
			Thirdyear();
			
		}
	      public static void Thirdyear() {
				System.out.println("This is Third Year");
				Fourthyear();
				
				
			}
	      public static void Fourthyear() {
				System.out.println("This is Fourth Year");
				System.out.println("----------------------------------------------------------------------------------------------------");
			}
	      
	}
 
class IT{
	public static void Firstyear() {
		System.out.println("This is first Year");
		Secondyear();
	}
      public static void Secondyear() {
		System.out.println("This is Second Year");
		Thirdyear();
		
	}
      public static void Thirdyear() {
			System.out.println("This is Third Year");
			Fourthyear();
			
			
		}
      public static void Fourthyear() {
			System.out.println("This is Fourth Year");
			
		}
}
