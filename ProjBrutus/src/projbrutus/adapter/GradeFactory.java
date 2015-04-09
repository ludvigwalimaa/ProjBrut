package projbrutus.adapter;

public class GradeFactory {
	//Skapas enligt Lazy materialization kap 26.5.
	private static GradeFactory instance;
	
	public static synchronized GradeFactory getInstance(){
		instance = new GradeFactory();
		return instance;
	}
	
		public Adapter chooseAdapter(int gradeType){
			if(gradeType == 0){
				return null;
			}
			if(gradeType == 1){
				System.out.println("Skapar VGAdapter");
				return new VGAdapter();
			}
			
			else if(gradeType == 2){
				return new NumberAdapter();
			}
			return null;
			
		}
}
