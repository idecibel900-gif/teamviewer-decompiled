package io.sentry.android.replay.viewhierarchy;

import androidx.compose.ui.node.LayoutNode;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends yz3 implements Function0 {
    public static final a n = new a(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        try {
            Method declaredMethod = LayoutNode.class.getDeclaredMethod("getCollapsedSemantics$ui_release", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }
}
