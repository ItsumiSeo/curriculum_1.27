package curriculum1_27;

public class animal {
	private String name;
	private double length;
	private int speed;
	private String caption;
	
	public animal(String[] args) {
		if (args.length == 3) {
			int i =0;
			name = args[i++];
			length = Double.parseDouble(args[i++]);
			speed = Integer.parseInt(args[i++]);
			createCaption();
		}
	}
	
	private void createCaption(){
		StringBuilder sb = new StringBuilder();
		sb.append("動物名：");
		sb.append(name);
		sb.append("体長：");
		sb.append(length);
		sb.append("ｍ");
		sb.append(System.lineSeparator());
		sb.append("速度：");
		sb.append(speed);
		sb.append("km/h");
		sb.append(System.lineSeparator());
		sb.append("学名：");
		sb.append(ScientificName.getScientificName(name));
		sb.append(System.lineSeparator());
		caption = sb.toString();
	}
	
	@Override
	public String toString() {
		return caption;
	}
}
