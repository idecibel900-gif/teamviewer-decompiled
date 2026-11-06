package o;

import android.text.SpannableStringBuilder;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class a60 {
    public static final String d;
    public static final String e;
    public static final a60 f;
    public static final a60 g;
    public final boolean a;
    public final int b;
    public final io.sentry.android.core.u0 c;

    static {
        io.sentry.android.core.u0 u0Var = yp7.c;
        d = Character.toString((char) 8206);
        e = Character.toString((char) 8207);
        f = new a60(false, 2, u0Var);
        g = new a60(true, 2, u0Var);
    }

    public a60(boolean z, int i, io.sentry.android.core.u0 u0Var) {
        this.a = z;
        this.b = i;
        this.c = u0Var;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        z50 z50Var = new z50(charSequence);
        z50Var.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = z50Var.c;
            if (i4 < z50Var.b && i == 0) {
                CharSequence charSequence2 = z50Var.a;
                char cCharAt = charSequence2.charAt(i4);
                z50Var.d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = z50Var.c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    z50Var.c = Character.charCount(iCodePointAt) + z50Var.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    z50Var.c = i5 + 1;
                    char c = z50Var.d;
                    directionality = c < 1792 ? z50.e[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (z50Var.c > 0) {
                    switch (z50Var.a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        z50 z50Var = new z50(charSequence);
        z50Var.c = z50Var.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (z50Var.c > 0) {
                byte bA = z50Var.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence, io.sentry.android.core.u0 u0Var) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zF = u0Var.f(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.b & 2;
        String str2 = "";
        String str3 = e;
        String str4 = d;
        boolean z = this.a;
        if (i != 0) {
            boolean zF2 = (zF ? yp7.b : yp7.a).f(charSequence.length(), charSequence);
            if (z || !(zF2 || a(charSequence) == 1)) {
                str = (!z || (zF2 && a(charSequence) != -1)) ? "" : str3;
            } else {
                str = str4;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zF != z) {
            spannableStringBuilder.append(zF ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zF3 = (zF ? yp7.b : yp7.a).f(charSequence.length(), charSequence);
        if (!z && (zF3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zF3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
