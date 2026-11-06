package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class uh4 {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static ii4 a(or3 or3Var, String str, boolean z) {
        try {
            qh4 qh4VarA = str == null ? null : rh4.b.a(str);
            if (qh4VarA != null) {
                return new ii4(qh4VarA);
            }
            qh4 qh4VarA2 = vh4.a(or3Var);
            if (str != null) {
                rh4.b.a.b(str, qh4VarA2);
            }
            return new ii4(qh4VarA2);
        } catch (Exception e) {
            return new ii4(e);
        } finally {
            if (z) {
                ta8.b(or3Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0150 A[Catch: IOException -> 0x02c3, TryCatch #3 {IOException -> 0x02c3, blocks: (B:7:0x0017, B:9:0x001d, B:12:0x0026, B:14:0x0032, B:75:0x0180, B:15:0x0037, B:17:0x0043, B:18:0x0048, B:20:0x0054, B:21:0x006c, B:24:0x0076, B:26:0x007e, B:28:0x0086, B:31:0x0090, B:33:0x0098, B:36:0x00a1, B:37:0x00a6, B:39:0x00b8, B:41:0x00d9, B:70:0x0146, B:72:0x0150, B:73:0x016d, B:69:0x0125, B:74:0x0171, B:5:0x000f, B:42:0x00e2, B:53:0x010b, B:68:0x0124, B:67:0x0121), top: B:136:0x000f, inners: #6 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0150, please report this as an issue */
    public static ii4 b(Context context, ZipInputStream zipInputStream, String str) {
        qh4 qh4VarA;
        gi4 gi4Var;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            qh4VarA = null;
        } else {
            try {
                qh4VarA = rh4.b.a(str);
            } catch (IOException e) {
                return new ii4(e);
            }
        }
        if (qh4VarA != null) {
            return new ii4(qh4VarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        qh4 qh4Var = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                w36 w36Var = new w36(et1.N(zipInputStream));
                String[] strArr = kr3.q;
                qh4Var = a(new or3(w36Var), null, false).a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new ii4(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStreamG = io.sentry.config.a.g(new FileOutputStream(file), file);
                    try {
                        FileOutputStream fileOutputStreamG2 = io.sentry.config.a.g(new FileOutputStream(file), file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStreamG2.write(bArr, 0, i);
                            }
                            fileOutputStreamG2.flush();
                            fileOutputStreamG2.close();
                            fileOutputStreamG.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStreamG2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStreamG.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    xe4.b("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        xe4.a("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile);
                    nextEntry = zipInputStream.getNextEntry();
                }
                Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                if (!file.delete()) {
                    xe4.a("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile2);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (qh4Var == null) {
            return new ii4(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) qh4Var.c()).values().iterator();
            do {
                if (!it.hasNext()) {
                    gi4Var = null;
                    break;
                }
                gi4Var = (gi4) it.next();
            } while (!gi4Var.d.equals(str4));
            if (gi4Var != null) {
                gi4Var.f = ta8.d((Bitmap) entry.getValue(), gi4Var.a, gi4Var.b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (jr2 jr2Var : qh4Var.f.values()) {
                if (jr2Var.a.equals(entry2.getKey())) {
                    jr2Var.c = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                xe4.a("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) qh4Var.c()).entrySet().iterator();
            while (it2.hasNext()) {
                gi4 gi4Var2 = (gi4) ((Map.Entry) it2.next()).getValue();
                if (gi4Var2 == null) {
                    return null;
                }
                String str5 = gi4Var2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            gi4Var2.f = ta8.d(bitmapDecodeByteArray, gi4Var2.a, gi4Var2.b);
                        }
                    } catch (IllegalArgumentException e2) {
                        xe4.b("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            rh4.b.a.b(str, qh4Var);
        }
        return new ii4(qh4Var);
    }

    public static Boolean c(w36 w36Var, byte[] bArr) {
        try {
            w36 w36VarPeek = w36Var.peek();
            for (byte b2 : bArr) {
                if (w36VarPeek.q() != b2) {
                    return Boolean.FALSE;
                }
            }
            w36VarPeek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            xe4.a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void d() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        io.sentry.h2.f();
    }
}
