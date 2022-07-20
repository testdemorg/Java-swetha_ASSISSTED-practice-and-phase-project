package assisted;

import java.util.*;


public class accessmodifier {
			
			public void DefaultMethod() {
			System.out.println("Inside Default Method");
			}
			public void PublicMethod() {
			System.out.println("Inside Public Method");
			}
			public void PrivateMethod() {
			System.out.println("Inside Private Method");
			}
			public void ProtectedMethod() {
			System.out.println("Inside Protected Method");
			}
			public static void main(String[] args) {
				
			accessmodifier a = new accessmodifier();
			a.PublicMethod();
			a.PrivateMethod();
			a.DefaultMethod();
			a.ProtectedMethod();
			
			}

		}



