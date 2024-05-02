package curriculum1_27;

public class animal {

	private String name;
	private double length;
	private int speed;
	private String caption;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCaption() {
		return caption;
	}

	public void setCapption(int caaption) {
		this.caption = caption;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public animal(String[] args) {
		if(args.length  == 3) {
			int i = 0;
			name = args[i++];
			length = Double.parseDouble(args[i++]);
			speed = Integer.parseInt(args[i++]);
			createCaption();
		}
	}
	
	private void createCaption() {
		StringBuilder sb = new StringBuilder();
		sb.append("動物名：");
		sb.append(name);
		sb.append(System.lineSeparator());
		sb.append("体長：");
		sb.append(length);
		sb.append("m");
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
	
	
}
