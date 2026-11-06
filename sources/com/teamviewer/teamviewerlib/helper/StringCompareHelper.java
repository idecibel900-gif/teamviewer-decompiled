package com.teamviewer.teamviewerlib.helper;

import java.text.Collator;
import java.util.Locale;
import kotlin.Metadata;
import o.ub7;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/teamviewer/teamviewerlib/helper/StringCompareHelper;", "", "", "jniInit", "()Z", "", "lhs", "rhs", "", "compare", "(Ljava/lang/String;Ljava/lang/String;)I", "string", "query", "contains", "(Ljava/lang/String;Ljava/lang/String;)Z", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class StringCompareHelper {
    public static final StringCompareHelper a = new StringCompareHelper();
    public static final Collator b;

    static {
        Collator collator = Collator.getInstance(Locale.getDefault());
        collator.setStrength(2);
        b = collator;
    }

    public static final int compare(String lhs, String rhs) {
        lhs.getClass();
        rhs.getClass();
        return b.compare(lhs, rhs);
    }

    public static final boolean contains(String string, String query) {
        string.getClass();
        query.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        Locale locale2 = Locale.getDefault();
        locale2.getClass();
        String lowerCase2 = query.toLowerCase(locale2);
        lowerCase2.getClass();
        return ub7.Q(lowerCase, lowerCase2, false);
    }

    private final native boolean jniInit();

    public final void a() {
        if (jniInit()) {
            return;
        }
        ye4.a("StringCompareHelper", "init failed");
    }
}
