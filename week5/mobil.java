package week5;

public class mobil {
    public int akselerasi, kekuatan;

    int cariMaksimumDQ(int arr[], int s, int f) {
        if (s == f) {
            return arr[s];
        }
        int mid = (s + f) / 2;
        int lmax = cariMaksimumDQ(arr, s, mid);
        int rmax = cariMaksimumDQ(arr, mid + 1, f);
        int max = 0;
        if (lmax > max) {
            max = lmax;
        } else if (rmax > max) {
            max = rmax;
        }
        return max;
    }

    int cariMinimumDQ(int arr[], int s, int f) {
        if (s == f) {
            return arr[s];
        }
        int mid = (s + f) / 2;
        int lmin = cariMinimumDQ(arr, s, mid);
        int rmin = cariMinimumDQ(arr, mid + 1, f);
        if (lmin < rmin) {
            return lmin;
        } else {
            return rmin;
        }

    }

    double hitungRerataBF(int[] n, int elm) {
        int total = 0;
        for (int i = 0; i < elm; i++) {
            total += n[i];
        }
        return (double) total / elm;
    }
}
