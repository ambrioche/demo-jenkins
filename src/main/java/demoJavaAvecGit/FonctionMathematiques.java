package demoJavaAvecGit;

public class FonctionMathematiques {
	
	public double addition (double a, double b) {
		return a+b;
	}
	
	public double factorielle (double nombre) {
		if (nombre <1) {
			throw new FactorielleException();
		}
		double fact=1;
		for (int i=1; i<=nombre; i++) {
			fact=fact*i;
		}
		return fact;
	}

}
