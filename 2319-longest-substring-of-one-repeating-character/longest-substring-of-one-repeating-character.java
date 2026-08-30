class Solution {
    int[] pre, suf, best;
    char[] lc, rc, a;

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int n = s.length();
        a = s.toCharArray();

        pre = new int[4 * n];
        suf = new int[4 * n];
        best = new int[4 * n];
        lc = new char[4 * n];
        rc = new char[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        for (int i = 0; i < queryIndices.length; i++) {
            a[queryIndices[i]] = queryCharacters.charAt(i);
            update(1, 0, n - 1, queryIndices[i]);
            ans[i] = best[1];
        }

        return ans;
    }

    void build(int node, int l, int r) {
        if (l == r) {
            lc[node] = rc[node] = a[l];
            pre[node] = suf[node] = best[node] = 1;
            return;
        }

        int mid = (l + r) / 2;

        build(node * 2, l, mid);
        build(node * 2 + 1, mid + 1, r);

        merge(node, node * 2, node * 2 + 1, mid - l + 1, r - mid);
    }

    void update(int node, int l, int r, int idx) {
        if (l == r) {
            lc[node] = rc[node] = a[l];
            pre[node] = suf[node] = best[node] = 1;
            return;
        }

        int mid = (l + r) / 2;

        if (idx <= mid)
            update(node * 2, l, mid, idx);
        else
            update(node * 2 + 1, mid + 1, r, idx);

        merge(node, node * 2, node * 2 + 1, mid - l + 1, r - mid);
    }

    void merge(int node, int left, int right, int lenL, int lenR) {
        lc[node] = lc[left];
        rc[node] = rc[right];

        pre[node] = pre[left];
        suf[node] = suf[right];

        if (pre[left] == lenL && lc[left] == lc[right])
            pre[node] += pre[right];

        if (suf[right] == lenR && rc[left] == rc[right])
            suf[node] += suf[left];

        best[node] = Math.max(best[left], best[right]);

        if (rc[left] == lc[right])
            best[node] = Math.max(best[node], suf[left] + pre[right]);
    }
}