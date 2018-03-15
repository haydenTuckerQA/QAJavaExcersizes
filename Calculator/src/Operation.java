public enum Operation {
	ADDITION,
	SUBTRACTION,
	MULTIPLICATION,
	DIVISION;
	
	double calculate(double x, double y) {
        switch (this) {
            case ADDITION:
                return x + y;
            case SUBTRACTION:
                return x - y;
            case MULTIPLICATION:
                return x * y;
            case DIVISION:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
}
