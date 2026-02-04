class ArrayDemo
{
	public static void main(String[] args) 
	{
		int[] numbers = new int[5];

        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;
        numbers[3] = 20;
        numbers[4] = 25;

        for (int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);
	 
        }
    }
}