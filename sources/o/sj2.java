package o;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class sj2 implements Closeable {
    public static final lt3 m;
    public static final wg5 n;

    static {
        lt3 lt3Var;
        try {
            Class.forName("java.nio.file.Files");
            lt3Var = new s35();
        } catch (ClassNotFoundException unused) {
            lt3Var = new lt3();
        }
        m = lt3Var;
        String str = wg5.n;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        n = vv.s(property);
        ClassLoader classLoader = xb6.class.getClassLoader();
        classLoader.getClass();
        new xb6(classLoader);
    }

    public final boolean F(wg5 wg5Var) {
        wg5Var.getClass();
        return Y(wg5Var) != null;
    }

    public List G(wg5 wg5Var) throws IOException {
        File file = wg5Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                yq4.v(wg5Var, "failed to list ");
                return null;
            }
            hk0.k(wg5Var, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(wg5Var.e(str));
        }
        pv0.a0(arrayList);
        return arrayList;
    }

    public final sn1 J(wg5 wg5Var) throws FileNotFoundException {
        wg5Var.getClass();
        sn1 sn1VarY = Y(wg5Var);
        if (sn1VarY != null) {
            return sn1VarY;
        }
        hk0.k(wg5Var, "no such file: ");
        return null;
    }

    public sn1 Y(wg5 wg5Var) {
        wg5Var.getClass();
        File file = wg5Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new sn1(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    public gs3 b0(wg5 wg5Var) {
        return new gs3(new RandomAccessFile(wg5Var.toFile(), "r"));
    }

    public v07 c0(wg5 wg5Var, boolean z) throws IOException {
        wg5Var.getClass();
        if (!z || !F(wg5Var)) {
            File file = wg5Var.toFile();
            return new ec5(io.sentry.config.a.f(file, new FileOutputStream(file, false), false), new ov7());
        }
        throw new IOException(wg5Var + " already exists.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public v07 e(wg5 wg5Var) {
        File file = wg5Var.toFile();
        return new ec5(io.sentry.config.a.f(file, new FileOutputStream(file, true), true), new ov7());
    }

    public void j(wg5 wg5Var, wg5 wg5Var2) throws IOException {
        wg5Var2.getClass();
        if (wg5Var.toFile().renameTo(wg5Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + wg5Var + " to " + wg5Var2);
    }

    public q67 k0(wg5 wg5Var) {
        wg5Var.getClass();
        File file = wg5Var.toFile();
        return new mj3(io.sentry.config.a.c(file, new FileInputStream(file)), ov7.d);
    }

    public void q(wg5 wg5Var) throws IOException {
        wg5Var.getClass();
        throw new IOException(this + " is read-only");
    }

    public void u(wg5 wg5Var) {
        wg5Var.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = wg5Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        yq4.v(wg5Var, "failed to delete ");
    }

    public final void z(wg5 wg5Var) {
        wg5Var.getClass();
        u(wg5Var);
    }
}
