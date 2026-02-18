
public class Q15a {

	public static void main(String[] args) {
		int W = 1, G = 2, K = 3, A = 4;

        System.out.println("Before exchange:");
        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);

        // Store W temporarily
        int temp = W;

        W = G;   // G → W
        G = K;   // K → G
        K = A;   // A → K
        A = temp; // W → A

        System.out.println("\nAfter exchange (using extra variable):");
        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);

	}

}
