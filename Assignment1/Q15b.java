
public class Q15b {

	public static void main(String[] args) {
		int W = 1, G = 2, K = 3, A = 4;

        System.out.println("Before exchange:");
        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);

        // Cyclic swap: W → A, A → K, K → G, G → W

        // Step 1: W <-> G
        W = W ^ G;
        G = W ^ G;
        W = W ^ G;

        // Step 2: W <-> K
        W = W ^ K;
        K = W ^ K;
        W = W ^ K;

        // Step 3: W <-> A
        W = W ^ A;
        A = W ^ A;
        W = W ^ A;

        System.out.println("\nAfter exchange:");
        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);

	}

}
