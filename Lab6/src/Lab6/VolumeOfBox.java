package Lab6;

public class VolumeOfBox {
	public int volume(int l,int b,int h) {
		int vol =l*b*h;
		System.out.println("Volume of the box is: "+vol);
		return l*b*h;
	}
public static void main(String[] args) {
	VolumeOfBox v = new VolumeOfBox();
	v.volume(5, 3, 3);
}
}
