package o;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.teamviewer.chatviewmodel.swig.IConversationListUIModel;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModel;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class wk0 implements dm6, ab3, si0, cj0, vc1, l92, n57 {
    public final /* synthetic */ byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f2420o;

    public wk0(Context context, byte b) {
        df6 df6Var;
        this.m = b;
        switch (b) {
            case 26:
                this.n = context;
                byte[] bArr = new byte[16];
                byte b2 = 11;
                System.arraycopy(xk0.v, 11, bArr, 0, 16);
                byte[] bArr2 = new byte[16];
                try {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                    Cipher.getInstance("AES/CBC/NoPadding").init(1, secretKeySpec, ivParameterSpec);
                    Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                    cipher.init(2, secretKeySpec, ivParameterSpec);
                    df6Var = new df6(cipher, b2);
                } catch (GeneralSecurityException e) {
                    e41.s("newCipher key/iv ", e.getMessage(), "TV_AesCbcCipher");
                    df6Var = null;
                }
                this.f2420o = df6Var;
                break;
            default:
                this.n = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
                try {
                    this.f2420o = new BufferedOutputStream(context.openFileOutput("connection.txt", 32768));
                } catch (FileNotFoundException e2) {
                    e41.s("caught FileNotFoundException on creation: ", e2.getMessage(), "ConnectionHistoryFileWriter");
                }
                break;
        }
    }

    public static wc6 F(wc6 wc6Var, wc6 wc6Var2, int i) {
        float f = wc6Var2.a;
        float f2 = wc6Var.a;
        float f3 = i + 1;
        float f4 = wc6Var2.b;
        float f5 = wc6Var.b;
        return new wc6(f2 + ((f - f2) / f3), f5 + ((f4 - f5) / f3));
    }

    public static char[] r(int i) {
        if (i <= 0) {
            i = 1;
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = ' ';
        }
        return cArr;
    }

    public static String s() {
        try {
            return bn4.a(bn4.a);
        } catch (Exception e) {
            e41.s("Error getting encryption key: ", e.getMessage(), "EncryptedPreferenceManager");
            return null;
        }
    }

    public static wc6 y(wc6 wc6Var, float f, float f2) {
        float f3 = wc6Var.a;
        float f4 = wc6Var.b;
        return new wc6(f3 < f ? f3 - 1.0f : f3 + 1.0f, f4 < f2 ? f4 - 1.0f : f4 + 1.0f);
    }

    public ua2 A() throws IOException {
        File file = (File) this.n;
        if (!file.exists()) {
            io.sentry.h2.m(file.getName(), "file doesn't exist: ");
            return null;
        }
        FileInputStream fileInputStreamC = io.sentry.config.a.c(file, new FileInputStream(file));
        return new ua2(fileInputStreamC.getFD(), ((ya7) this.f2420o).b(fileInputStreamC, file.getName().getBytes(StandardCharsets.UTF_8)));
    }

    public va2 B() {
        File file = (File) this.n;
        if (file.exists()) {
            io.sentry.h2.m(file.getName(), "output file already exists, please use a new file: ");
            return null;
        }
        FileOutputStream fileOutputStreamG = io.sentry.config.a.g(new FileOutputStream(file), file);
        return new va2(fileOutputStreamG.getFD(), ((ya7) this.f2420o).a(fileOutputStreamG, file.getName().getBytes(StandardCharsets.UTF_8)));
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void C(Context context, XmlResourceParser xmlResourceParser) {
        k61 k61Var = new k61();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        io.sentry.android.core.v0.c("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    f61 f61VarC = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (f61VarC == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        f61VarC.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (f61VarC == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        f61VarC.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        f61VarC = k61.c(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (f61VarC == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        f61VarC.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (f61VarC == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        f61VarC.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        f61VarC = k61.c(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        f61VarC.d.a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (f61VarC != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        x51.a(context, xmlResourceParser, f61VarC.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        f61VarC = k61.c(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        f61VarC.d.h0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (f61VarC != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        x51.a(context, xmlResourceParser, f61VarC.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        f61VarC = k61.c(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        k61Var.b.put(Integer.valueOf(f61VarC.a), f61VarC);
                                        f61VarC = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        k61Var.b.put(Integer.valueOf(f61VarC.a), f61VarC);
                                        f61VarC = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        k61Var.b.put(Integer.valueOf(f61VarC.a), f61VarC);
                                        f61VarC = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.f2420o).put(identifier, k61Var);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    io.sentry.android.core.v0.d("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e2) {
                    io.sentry.android.core.v0.d("ConstraintSet", "Error parsing XML resource", e2);
                }
                ((SparseArray) this.f2420o).put(identifier, k61Var);
                return;
            }
        }
    }

    public boolean D(String str, byte[] bArr) {
        if (str.length() == 0) {
            ye4.c("EncryptedPreferenceManager", "putByteArray params error");
            return false;
        }
        try {
            return K("v2".concat(str), bArr);
        } catch (Exception e) {
            e41.s("putByteArray: ", e.getMessage(), "EncryptedPreferenceManager");
            return false;
        }
    }

    public void E(int i, int i2, int i3, int i4) {
        cm0 cm0Var = (cm0) this.f2420o;
        cm0Var.p.set(i, i2, i3, i4);
        Rect rect = cm0Var.f538o;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a A[RETURN] */
    public float G(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 1;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int iAbs = Math.abs(i7 - i5);
        int iAbs2 = Math.abs(i8 - i6);
        int i11 = 2;
        int i12 = (-iAbs) / 2;
        int i13 = i5 < i7 ? 1 : -1;
        int i14 = i6 < i8 ? 1 : -1;
        int i15 = i7 + i13;
        int i16 = i5;
        int i17 = i6;
        int i18 = 0;
        while (i16 != i15) {
            boolean z2 = z;
            if ((i18 == i10 ? i10 : 0) == ((k70) this.n).b(z ? i17 : i16, z ? i16 : i17)) {
                if (i18 == 2) {
                    return xs1.C(i16, i17, i5, i6);
                }
                i18++;
            }
            i12 += iAbs2;
            if (i12 > 0) {
                if (i17 == i8) {
                    i9 = 2;
                    if (i18 == i9) {
                        return xs1.C(i15, i8, i5, i6);
                    }
                    return Float.NaN;
                }
                i17 += i14;
                i12 -= iAbs;
            }
            i16 += i13;
            iAbs = iAbs;
            z = z2;
            i10 = 1;
            i11 = 2;
        }
        i9 = i11;
        if (i18 == i9) {
            return xs1.C(i15, i8, i5, i6);
        }
        return Float.NaN;
    }

    public float H(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        k70 k70Var = (k70) this.n;
        float fG = G(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = k70Var.m;
            if (i5 >= i7) {
                float f3 = ((i7 - 1) - i) / (i5 - i);
                int i8 = i7 - 1;
                f = f3;
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f4 = i2;
        int i9 = (int) (f4 - ((i4 - i2) * f));
        if (i9 < 0) {
            f2 = f4 / (i2 - i9);
        } else {
            int i10 = k70Var.n;
            if (i9 >= i10) {
                f2 = ((i10 - 1) - i2) / (i9 - i2);
                i6 = i10 - 1;
            } else {
                i6 = i9;
                f2 = 1.0f;
            }
        }
        return (G(i, i2, (int) (((i5 - i) * f2) + i), i6) + fG) - 1.0f;
    }

    public int I(wc6 wc6Var, wc6 wc6Var2) {
        int i = (int) wc6Var.a;
        int i2 = (int) wc6Var.b;
        int i3 = (int) wc6Var2.a;
        k70 k70Var = (k70) this.n;
        int iMin = Math.min(k70Var.n - 1, (int) wc6Var2.b);
        int i4 = 0;
        boolean z = Math.abs(iMin - i2) > Math.abs(i3 - i);
        if (z) {
            i = i2;
            i2 = i;
            i3 = iMin;
            iMin = i3;
        }
        int iAbs = Math.abs(i3 - i);
        int iAbs2 = Math.abs(iMin - i2);
        int i5 = (-iAbs) / 2;
        int i6 = i2 < iMin ? 1 : -1;
        int i7 = i >= i3 ? -1 : 1;
        boolean zB = k70Var.b(z ? i2 : i, z ? i : i2);
        while (i != i3) {
            boolean zB2 = k70Var.b(z ? i2 : i, z ? i : i2);
            if (zB2 != zB) {
                i4++;
                zB = zB2;
            }
            i5 += iAbs2;
            if (i5 > 0) {
                if (i2 == iMin) {
                    return i4;
                }
                i2 += i6;
                i5 -= iAbs;
            }
            i += i7;
        }
        return i4;
    }

    public void J() {
        synchronized (this) {
            ((AtomicInteger) this.n).decrementAndGet();
            if (((AtomicInteger) this.n).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public boolean K(String str, byte[] bArr) {
        String str2;
        StringBuilder sb;
        String strS = s();
        boolean z = false;
        if (strS == null) {
            return false;
        }
        yl7 yl7Var = yl7.z;
        Context context = (Context) this.n;
        synchronized (yl7Var) {
            va2 va2VarB = null;
            try {
                try {
                    try {
                        File file = new File(context.getFilesDir(), str);
                        wk0 wk0VarD = new j93(file, context, strS, wa2.n).D();
                        if (file.exists()) {
                            file.delete();
                        }
                        va2VarB = wk0VarD.B();
                        va2VarB.write(bArr);
                        Closeable closeable = new Closeable[]{va2VarB}[0];
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (IOException e) {
                                ye4.c("FileHelper", "close " + e.getMessage());
                            }
                        }
                        z = true;
                    } catch (IOException e2) {
                        ye4.c("FileManager", "writeEncryptedData " + e2.getMessage());
                        Closeable closeable2 = new Closeable[]{va2VarB}[0];
                        if (closeable2 != null) {
                            try {
                                closeable2.close();
                            } catch (IOException e3) {
                                str2 = "FileHelper";
                                String message = e3.getMessage();
                                sb = new StringBuilder("close ");
                                sb.append(message);
                                ye4.c(str2, sb.toString());
                            }
                        }
                    }
                } catch (GeneralSecurityException e4) {
                    ye4.c("FileManager", "writeEncryptedData " + e4.getMessage());
                    Closeable closeable3 = new Closeable[]{va2VarB}[0];
                    if (closeable3 != null) {
                        try {
                            closeable3.close();
                        } catch (IOException e5) {
                            str2 = "FileHelper";
                            String message2 = e5.getMessage();
                            sb = new StringBuilder("close ");
                            sb.append(message2);
                            ye4.c(str2, sb.toString());
                        }
                    }
                }
            } catch (Throwable th) {
                Closeable closeable4 = new Closeable[]{va2VarB}[0];
                if (closeable4 != null) {
                    try {
                        closeable4.close();
                    } catch (IOException e6) {
                        ye4.c("FileHelper", "close " + e6.getMessage());
                    }
                }
                throw th;
            }
        }
        return z;
    }

    @Override // o.si0
    public Object a(a75 a75Var) {
        Executor executor = (Executor) this.f2420o;
        return executor == null ? a75Var : new qj1(executor, a75Var);
    }

    @Override // o.ab3
    public void b() {
        y21 y21Var = (y21) this.n;
        l07 l07Var = y21Var.r0;
        if (l07Var == null) {
            im3.e0("startConnectionFeedbackUiFactory");
            throw null;
        }
        va3 va3Var = (va3) this.f2420o;
        if (va3Var != null) {
            long j = ((iv1) va3Var).H;
            y87 y87Var = new y87(l07Var, (byte) 1);
            MachineListViewModel machineListViewModelO = ds1.o(new PListContactID(j), true, false);
            machineListViewModelO.getClass();
            gk7.O0(l07.A(machineListViewModelO, y87Var), y21Var.p0());
        }
    }

    @Override // o.n57
    public q67 c() {
        return (le2) this.f2420o;
    }

    @Override // o.cj0
    public void d(qi0 qi0Var, Throwable th) {
        ((qj1) this.f2420o).m.execute(new io.sentry.android.core.internal.util.j((Object) this, this.n, (Object) th, (byte) 5));
    }

    @Override // o.cj0
    public void e(qi0 qi0Var, kc6 kc6Var) {
        ((qj1) this.f2420o).m.execute(new io.sentry.android.core.internal.util.j((Object) this, this.n, (Object) kc6Var, (byte) 4));
    }

    @Override // o.si0
    public Type f() {
        return (Type) this.n;
    }

    public void finalize() throws Throwable {
        switch (this.m) {
            case 7:
                BufferedOutputStream bufferedOutputStream = (BufferedOutputStream) this.f2420o;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.flush();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // o.l92
    public boolean g(CharSequence charSequence, int i, int i2, z58 z58Var) {
        if ((z58Var.c & 4) > 0) {
            return true;
        }
        if (((u88) this.n) == null) {
            this.n = new u88(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((vv) this.f2420o).getClass();
        ((u88) this.n).setSpan(new a68(z58Var), i, i2, 33);
        return true;
    }

    @Override // o.dm6
    public boolean h(String str) {
        str.getClass();
        if (str.length() != 0) {
            return false;
        }
        ((IConversationListUIModel) this.n).ResetRoomSearch();
        return true;
    }

    @Override // o.dm6
    public boolean i(String str) {
        str.getClass();
        ((IConversationListUIModel) this.n).StartRoomSearch(str);
        View view = (View) this.f2420o;
        if (view == null) {
            ye4.c("GUIHelperFuncs", "hideSoftkeyboard(): can't hide - view is null!");
            return true;
        }
        Object systemService = view.getContext().getApplicationContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        return true;
    }

    public zr7 j(List list) {
        e82 e82Var = null;
        try {
            int size = list.size();
            int i = 0;
            e82 e82Var2 = null;
            while (i < size) {
                try {
                    e82 e82Var3 = (e82) list.get(i);
                    try {
                        e82Var3.a((h82) this.f2420o);
                        i++;
                        e82Var2 = e82Var3;
                    } catch (Exception e) {
                        e = e;
                        e82Var = e82Var3;
                        StringBuilder sb = new StringBuilder();
                        int iK = ((h82) this.f2420o).a.k();
                        gt7 gt7VarC = ((h82) this.f2420o).c();
                        h82 h82Var = (h82) this.f2420o;
                        sb.append("Error while applying EditCommand batch to buffer (length=" + iK + ", composition=" + gt7VarC + ", selection=" + gt7.h(h57.a(h82Var.b, h82Var.c)) + "):");
                        sb.append('\n');
                        lv0.s0(list, sb, "\n", null, null, new a81((Object) e82Var, (Object) this, (byte) 15), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    e82Var = e82Var2;
                }
            }
            h82 h82Var2 = (h82) this.f2420o;
            h82Var2.getClass();
            xo xoVar = new xo(h82Var2.a.toString());
            h82 h82Var3 = (h82) this.f2420o;
            long jA = h57.a(h82Var3.b, h82Var3.c);
            gt7 gt7Var = gt7.g(((zr7) this.n).b) ? null : new gt7(jA);
            zr7 zr7Var = new zr7(xoVar, gt7Var != null ? gt7Var.a : h57.a(gt7.e(jA), gt7.f(jA)), ((h82) this.f2420o).c());
            this.n = zr7Var;
            return zr7Var;
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // o.l92
    public Object k() {
        return (u88) this.n;
    }

    @Override // o.ab3
    public void l() {
        if (((y21) this.n).r0 == null) {
            im3.e0("startConnectionFeedbackUiFactory");
            throw null;
        }
        Context context = d82.M;
        if (context == null) {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            return;
        }
        String string = context.getString(R.string.tv_IDS_STATUS_AUTHENTICATION_NOINCOMING);
        string.getClass();
        fx3.r(string, 1, context, bu7.MAIN);
    }

    public boolean m() {
        synchronized (this) {
            if (((AtomicBoolean) this.f2420o).get()) {
                return false;
            }
            ((AtomicInteger) this.n).incrementAndGet();
            return true;
        }
    }

    public float n(il2 il2Var, il2 il2Var2) {
        int i = (int) il2Var.a;
        int i2 = (int) il2Var.b;
        int i3 = (int) il2Var2.a;
        int i4 = (int) il2Var2.b;
        float fH = H(i, i2, i3, i4);
        float fH2 = H((int) il2Var2.a, i4, (int) il2Var.a, i2);
        if (Float.isNaN(fH)) {
            return fH2 / 7.0f;
        }
        return Float.isNaN(fH2) ? fH / 7.0f : (fH + fH2) / 14.0f;
    }

    public ne o(float f, float f2, int i, int i2) throws d55 {
        ne neVarB;
        ne neVarB2;
        int i3 = (int) (f2 * f);
        int iMax = Math.max(0, i - i3);
        k70 k70Var = (k70) this.n;
        int iMin = Math.min(k70Var.m - 1, i + i3) - iMax;
        float f3 = 3.0f * f;
        if (iMin < f3) {
            throw d55.a();
        }
        int iMax2 = Math.max(0, i2 - i3);
        int iMin2 = Math.min(k70Var.n - 1, i2 + i3) - iMax2;
        if (iMin2 < f3) {
            throw d55.a();
        }
        k70 k70Var2 = (k70) this.n;
        oe oeVar = new oe(k70Var2, iMax, iMax2, iMin, iMin2, f, (xc6) this.f2420o);
        int i4 = oeVar.e;
        int i5 = oeVar.c;
        int i6 = i4 + i5;
        int i7 = oeVar.f;
        int i8 = (i7 / 2) + oeVar.d;
        int[] iArr = new int[3];
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = ((i9 & 1) == 0 ? (i9 + 1) / 2 : -((i9 + 1) / 2)) + i8;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i11 = i5;
            while (i11 < i6 && !k70Var2.b(i11, i10)) {
                i11++;
            }
            int i12 = 0;
            while (i11 < i6) {
                if (!k70Var2.b(i11, i10)) {
                    if (i12 == 1) {
                        i12++;
                    }
                    iArr[i12] = iArr[i12] + 1;
                } else if (i12 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i12 != 2) {
                    i12++;
                    iArr[i12] = iArr[i12] + 1;
                } else {
                    if (oeVar.a(iArr) && (neVarB2 = oeVar.b(i10, i11, iArr)) != null) {
                        return neVarB2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i12 = 1;
                }
                i11++;
            }
            if (oeVar.a(iArr) && (neVarB = oeVar.b(i10, i6, iArr)) != null) {
                return neVarB;
            }
        }
        ArrayList arrayList = oeVar.b;
        if (arrayList.isEmpty()) {
            throw d55.a();
        }
        return (ne) arrayList.get(0);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x037f */
    /* JADX WARN: Code duplicated, block: B:100:0x01ca A[Catch: all -> 0x0258, TRY_ENTER, TRY_LEAVE, TryCatch #32 {all -> 0x0258, blocks: (B:88:0x019c, B:90:0x01a4, B:93:0x01a9, B:100:0x01ca, B:102:0x01d2, B:105:0x01d7, B:122:0x0233, B:124:0x023b, B:128:0x0257, B:127:0x0240, B:114:0x020d, B:116:0x0215, B:119:0x021a, B:131:0x025b, B:133:0x0263, B:136:0x0268), top: B:241:0x0181, inners: #12, #18, #20, #27, #29 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0284  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:191:0x0382  */
    /* JADX WARN: Code duplicated, block: B:194:0x038c  */
    /* JADX WARN: Code duplicated, block: B:214:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x02b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x02cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x01a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0168  */
    /* JADX WARN: Code duplicated, block: B:79:0x016b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0173  */
    /* JADX WARN: Code duplicated, block: B:87:0x0195 A[Catch: all -> 0x01c4, IOException -> 0x01c8, FileNotFoundException -> 0x025b, TRY_LEAVE, TryCatch #19 {all -> 0x01c4, blocks: (B:85:0x0189, B:87:0x0195, B:113:0x01f8), top: B:226:0x0181 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v56, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] p(java.lang.String r10, byte[] r11) {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wk0.p(java.lang.String, byte[]):byte[]");
    }

    public w20 q(int i) {
        w20 w20Var;
        w20 w20Var2;
        w20[] w20VarArr = (w20[]) this.f2420o;
        w20 w20Var3 = w20VarArr[t(i)];
        if (w20Var3 != null) {
            return w20Var3;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int iT = t(i) - i2;
            if (iT >= 0 && (w20Var2 = w20VarArr[iT]) != null) {
                return w20Var2;
            }
            int iT2 = t(i) + i2;
            if (iT2 < w20VarArr.length && (w20Var = w20VarArr[iT2]) != null) {
                return w20Var;
            }
        }
        return null;
    }

    public int t(int i) {
        return i - ((la0) this.n).h;
    }

    public String toString() {
        switch (this.m) {
            case 14:
                Formatter formatter = new Formatter();
                try {
                    int i = 0;
                    for (w20 w20Var : (w20[]) this.f2420o) {
                        if (w20Var == null) {
                            formatter.format("%3d:    |   %n", Integer.valueOf(i));
                            i++;
                        } else {
                            formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(w20Var.f), Integer.valueOf(w20Var.e));
                            i++;
                        }
                    }
                    String string = formatter.toString();
                    formatter.close();
                    return string;
                } catch (Throwable th) {
                    try {
                        formatter.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                return super.toString();
        }
    }

    @Override // o.n57
    public v07 u() {
        return (ke2) this.n;
    }

    public boolean v(wc6 wc6Var) {
        float f = wc6Var.a;
        if (f < 0.0f) {
            return false;
        }
        k70 k70Var = (k70) this.n;
        if (f > k70Var.m - 1) {
            return false;
        }
        float f2 = wc6Var.b;
        return f2 > 0.0f && f2 <= ((float) (k70Var.n - 1));
    }

    @Override // o.vc1
    public Object w(Object obj) {
        nc6 nc6Var = (nc6) obj;
        nc6Var.getClass();
        g95 g95Var = (g95) this.f2420o;
        nw3 nw3Var = (nw3) this.n;
        return ((rp3) g95Var.m).a(nc6Var.u(), nw3Var);
    }

    public void x() throws IOException {
        String str = (String) this.n;
        if (((FileChannel) this.f2420o) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = io.sentry.config.a.g(new FileOutputStream(file), file).getChannel();
            this.f2420o = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.f2420o;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f2420o = null;
            throw new IllegalStateException(fx3.g("Unable to lock file: '", str, "'."), th);
        }
    }

    public AutofillId z(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return eq.k(va1.h(this.n), ((View) this.f2420o).getAutofillId(), j);
        }
        return null;
    }

    public /* synthetic */ wk0(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f2420o = obj2;
    }

    public /* synthetic */ wk0(byte b, boolean z) {
        this.m = b;
    }

    public wk0(byte b) {
        this.m = b;
        switch (b) {
            case 21:
                tk1 tk1Var = g22.a;
                gk1 gk1Var = gk1.f901o;
                q43 q43Var = ok4.a;
                gk1Var.getClass();
                q43Var.getClass();
                this.n = gk1Var;
                this.f2420o = q43Var;
                break;
            default:
                this.n = new pc8(true);
                this.f2420o = new pc8(true);
                break;
        }
    }

    public wk0(Function1 function1) {
        this.m = (byte) 5;
        this.n = function1;
        this.f2420o = new ConcurrentHashMap();
    }

    public wk0(la0 la0Var) {
        this.m = (byte) 14;
        this.n = new la0(la0Var);
        this.f2420o = new w20[(la0Var.i - la0Var.h) + 1];
    }

    public wk0(String str) {
        this.m = (byte) 29;
        this.n = str.concat(".lck");
    }

    public wk0(k70 k70Var, byte b) {
        this.m = b;
        switch (b) {
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                this.n = k70Var;
                break;
            default:
                this.n = k70Var;
                this.f2420o = new xi8(k70Var);
                break;
        }
    }

    public wk0(ax1 ax1Var) {
        this.m = (byte) 4;
        this.n = new AtomicInteger(0);
        this.f2420o = new AtomicBoolean(false);
    }

    public wk0(FrameLayout frameLayout, TabLayout tabLayout, TextView textView) {
        this.m = (byte) 17;
        this.n = frameLayout;
        this.f2420o = textView;
    }

    public wk0(IConversationListUIModel iConversationListUIModel, View view) {
        this.m = (byte) 2;
        iConversationListUIModel.getClass();
        view.getClass();
        this.n = iConversationListUIModel;
        this.f2420o = view;
    }

    public wk0(ConstraintLayout constraintLayout, ProgressBar progressBar, View view, ExpandableListView expandableListView, ImageView imageView, TextView textView) {
        this.m = (byte) 19;
        this.n = constraintLayout;
        this.f2420o = view;
    }

    public wk0(qj1 qj1Var, cj0 cj0Var) {
        this.m = (byte) 12;
        this.f2420o = qj1Var;
        this.n = cj0Var;
    }

    public wk0(io.sentry.z7 z7Var) {
        this.m = (byte) 27;
        ne2 ne2Var = (ne2) z7Var.d;
        this.n = new ke2(z7Var, ne2Var.f().u(), -1L, true);
        this.f2420o = new le2(z7Var, ne2Var.f().c(), -1L, true);
    }

    public wk0(EditText editText) {
        this.m = (byte) 23;
        this.n = editText;
        s92 s92Var = new s92(editText);
        this.f2420o = s92Var;
        editText.addTextChangedListener(s92Var);
        if (f92.b == null) {
            synchronized (f92.a) {
                try {
                    if (f92.b == null) {
                        f92 f92Var = new f92();
                        try {
                            f92.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, f92.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        f92.b = f92Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(f92.b);
    }

    public wk0(cm0 cm0Var) {
        this.m = (byte) 1;
        this.f2420o = cm0Var;
    }
}
