package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l72 extends f78 {
    public static final int[] j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    public static final int[] k = {1, 1, 1, 1, 1, 1};
    public static final int[][] l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    public final /* synthetic */ byte h;
    public final Object i;

    public l72(byte b) {
        this.h = b;
        switch (b) {
            case 1:
                this.i = new int[4];
                break;
            case 2:
                this.i = new int[4];
                break;
            case 3:
                this.i = new l72((byte) 0);
                break;
            default:
                this.i = new int[4];
                break;
        }
    }

    public static uc6 o(uc6 uc6Var) throws at2 {
        String str = uc6Var.a;
        if (str.charAt(0) != '0') {
            throw at2.a();
        }
        uc6 uc6Var2 = new uc6(str.substring(1), null, uc6Var.c, v20.A);
        Map map = uc6Var.e;
        if (map != null) {
            uc6Var2.a(map);
        }
        return uc6Var2;
    }

    @Override // o.a95, o.n36
    public uc6 a(cj3 cj3Var, Map map) {
        switch (this.h) {
            case 3:
                return o(((l72) this.i).a(cj3Var, map));
            default:
                return super.a(cj3Var, map);
        }
    }

    @Override // o.f78, o.a95
    public uc6 b(int i, i70 i70Var, Map map) {
        switch (this.h) {
            case 3:
                return o(((l72) this.i).b(i, i70Var, map));
            default:
                return super.b(i, i70Var, map);
        }
    }

    @Override // o.f78
    public boolean g(String str) {
        switch (this.h) {
            case 1:
                char[] cArr = new char[6];
                str.getChars(1, 7, cArr, 0);
                StringBuilder sb = new StringBuilder(12);
                sb.append(str.charAt(0));
                char c = cArr[5];
                switch (c) {
                    case '0':
                    case '1':
                    case '2':
                        sb.append(cArr, 0, 2);
                        sb.append(c);
                        sb.append("0000");
                        sb.append(cArr, 2, 3);
                        break;
                    case '3':
                        sb.append(cArr, 0, 3);
                        sb.append("00000");
                        sb.append(cArr, 3, 2);
                        break;
                    case '4':
                        sb.append(cArr, 0, 4);
                        sb.append("00000");
                        sb.append(cArr[4]);
                        break;
                    default:
                        sb.append(cArr, 0, 5);
                        sb.append("0000");
                        sb.append(c);
                        break;
                }
                if (str.length() >= 8) {
                    sb.append(str.charAt(7));
                }
                return super.g(sb.toString());
            default:
                return super.g(str);
        }
    }

    @Override // o.f78
    public int[] i(i70 i70Var, int i) {
        switch (this.h) {
            case 1:
                return f78.l(i70Var, i, true, k, new int[6]);
            default:
                return super.i(i70Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.f78
    public final int j(i70 i70Var, int[] iArr, StringBuilder sb) throws d55 {
        byte b = this.h;
        int[][] iArr2 = f78.g;
        int[] iArr3 = f78.e;
        int[][] iArr4 = f78.f;
        int i = 1;
        Object obj = this.i;
        switch (b) {
            case 0:
                int[] iArr5 = (int[]) obj;
                iArr5[0] = 0;
                iArr5[1] = 0;
                iArr5[2] = 0;
                iArr5[3] = 0;
                int i2 = i70Var.n;
                int i3 = iArr[1];
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 6; i4 < i6 && i3 < i2; i6 = 6) {
                    int iH = f78.h(i70Var, iArr5, i3, iArr2);
                    sb.append((char) ((iH % 10) + 48));
                    int i7 = i;
                    for (int i8 : iArr5) {
                        i3 += i8;
                    }
                    if (iH >= 10) {
                        i5 |= i7 << (5 - i4);
                    }
                    i4++;
                    i = i7;
                }
                boolean z = i;
                for (int i9 = 0; i9 < 10; i9++) {
                    if (i5 == j[i9]) {
                        sb.insert(0, (char) (i9 + 48));
                        int i10 = f78.l(i70Var, i3, z, iArr3, new int[5])[z ? 1 : 0];
                        for (int i11 = 0; i11 < 6 && i10 < i2; i11++) {
                            sb.append((char) (f78.h(i70Var, iArr5, i10, iArr4) + 48));
                            for (int i12 : iArr5) {
                                i10 += i12;
                            }
                        }
                        return i10;
                    }
                }
                throw d55.a();
            case 1:
                int[] iArr6 = (int[]) obj;
                iArr6[0] = 0;
                iArr6[1] = 0;
                iArr6[2] = 0;
                iArr6[3] = 0;
                int i13 = i70Var.n;
                int i14 = iArr[1];
                int i15 = 0;
                for (int i16 = 0; i16 < 6 && i14 < i13; i16++) {
                    int iH2 = f78.h(i70Var, iArr6, i14, iArr2);
                    sb.append((char) ((iH2 % 10) + 48));
                    for (int i17 : iArr6) {
                        i14 += i17;
                    }
                    if (iH2 >= 10) {
                        i15 |= 1 << (5 - i16);
                    }
                }
                for (int i18 = 0; i18 <= 1; i18++) {
                    for (int i19 = 0; i19 < 10; i19++) {
                        if (i15 == l[i18][i19]) {
                            sb.insert(0, (char) (i18 + 48));
                            sb.append((char) (i19 + 48));
                            return i14;
                        }
                    }
                }
                throw d55.a();
            case 2:
                int[] iArr7 = (int[]) obj;
                iArr7[0] = 0;
                iArr7[1] = 0;
                iArr7[2] = 0;
                iArr7[3] = 0;
                int i20 = i70Var.n;
                int i21 = iArr[1];
                for (int i22 = 0; i22 < 4 && i21 < i20; i22++) {
                    sb.append((char) (f78.h(i70Var, iArr7, i21, iArr4) + 48));
                    for (int i23 : iArr7) {
                        i21 += i23;
                    }
                }
                int i24 = f78.l(i70Var, i21, true, iArr3, new int[5])[1];
                for (int i25 = 0; i25 < 4 && i24 < i20; i25++) {
                    sb.append((char) (f78.h(i70Var, iArr7, i24, iArr4) + 48));
                    for (int i26 : iArr7) {
                        i24 += i26;
                    }
                }
                return i24;
            default:
                return ((l72) obj).j(i70Var, iArr, sb);
        }
    }

    @Override // o.f78
    public uc6 k(int i, i70 i70Var, int[] iArr, Map map) {
        switch (this.h) {
            case 3:
                return o(((l72) this.i).k(i, i70Var, iArr, map));
            default:
                return super.k(i, i70Var, iArr, map);
        }
    }

    @Override // o.f78
    public final v20 n() {
        switch (this.h) {
            case 0:
                return v20.t;
            case 1:
                return v20.B;
            case 2:
                return v20.s;
            default:
                return v20.A;
        }
    }
}
