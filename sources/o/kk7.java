package o;

import android.content.SharedPreferences;
import com.teamviewer.teamviewerlib.settings.Settings;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class kk7 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final jk7 f1275o = new jk7();
    public static kk7 p;
    public final fi7 m;
    public final Thread.UncaughtExceptionHandler n = Thread.getDefaultUncaughtExceptionHandler();

    public kk7(fi7 fi7Var) {
        this.m = fi7Var;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        File file;
        thread.getClass();
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append("Date: ").append((CharSequence) new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US).format(new Date())).append("\n");
        Settings.i.n();
        String string = Settings.e().toString();
        string.getClass();
        printWriter.append("ID: ").append((CharSequence) string).append("\n");
        printWriter.append("Build: ").append("298").append("\n");
        printWriter.append("===========\n");
        printWriter.append("Stacktrace:\n\n");
        th.printStackTrace(printWriter);
        printWriter.append("===========\n");
        printWriter.append("Cause:\n\n");
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
            printWriter.append("\n");
        }
        printWriter.append("===========\n");
        Pattern pattern = qe4.a;
        String string2 = stringWriter.toString();
        string2.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        int i2 = 0;
        while (true) {
            fi7 fi7Var = this.m;
            if (i >= 3) {
                File filesDir = fi7Var.getFilesDir();
                filesDir.getClass();
                file = new File(filesDir, fx3.f(i2, "dumplog", ".trace"));
                break;
            }
            File filesDir2 = fi7Var.getFilesDir();
            filesDir2.getClass();
            file = new File(filesDir2, fx3.f(i, "dumplog", ".trace"));
            if (!file.exists()) {
                break;
            }
            if (jCurrentTimeMillis > file.lastModified()) {
                jCurrentTimeMillis = file.lastModified();
                i2 = i;
            }
            i++;
        }
        try {
            FileOutputStream fileOutputStreamG = io.sentry.config.a.g(new FileOutputStream(file), file);
            try {
                byte[] bytes = string2.getBytes(vn0.a);
                bytes.getClass();
                fileOutputStreamG.write(bytes);
                fileOutputStreamG.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kh.n(fileOutputStreamG, th2);
                    throw th3;
                }
            }
        } catch (IOException e) {
            e41.s("IOException when writing crashlog: ", e.getMessage(), "LogStorage");
        }
        SharedPreferences sharedPreferences = h57.a;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putBoolean("CRASH_OCCURED", true);
        editorEdit.commit();
        ye4.c("TVExceptionHandler", "got uncaught exception: " + th.getMessage());
        printWriter.close();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.n;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
