public class Comparator<R extends Comparable<R> > {
	public R getMax(R n, R m) {
		/*
		if (n.compareTo(m) > 0) {
			return n;
		} else {
			return m;
		}
		*/
		return(n.compareTo(m) > 0 ? n : m);
	}

	public static void main(String[] args) {
		Comparator c = new Comparator();
		System.out.println(c.getMax(3, 10));
		System.out.println(c.getMax(50.345, 10.222));
		System.out.println(c.getMax("34", "8"));
	}
	
}
