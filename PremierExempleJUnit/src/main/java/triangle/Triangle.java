package triangle;

public class Triangle {
	
	/* Cette fonction retourne comme résultat un code 0 si le triangle défini par a, b et c est 
	    	invalide, 1 si le triangle est équilatéral, 2 si le triangle est isocèle et 3 pour 
	    		un triangle valide quelconque */
	
	public static int triangle(int a,int b,int c)
	{
		if (a+b<=c)
			return 0;
		if (a+c<=b)
			return 0;
		if (c+b<=a)
			return 0;
		if (a==b && b==c)
			return 1;
		if (a==b || b==c || a==c)
			return 2;
		return 3;
	}

};
