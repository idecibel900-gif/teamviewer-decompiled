package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class lp6 {
    public static final /* synthetic */ fw3[] a = {new gx4(1, lp6.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new gx4(1, lp6.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;"), new gx4(1, lp6.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new gx4(1, lp6.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new gx4(1, lp6.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new gx4(1, lp6.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new gx4(1, lp6.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new gx4(1, lp6.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new gx4(1, lp6.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;"), new gx4(1, lp6.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;"), new gx4(1, lp6.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;"), new gx4(1, lp6.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F"), new gx4(1, lp6.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new gx4(1, lp6.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new gx4(1, lp6.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new gx4(1, lp6.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new gx4(1, lp6.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new gx4(1, lp6.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new gx4(1, lp6.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new gx4(1, lp6.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new gx4(1, lp6.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J"), new gx4(1, lp6.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;"), new gx4(1, lp6.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new gx4(1, lp6.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new gx4(1, lp6.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;"), new gx4(1, lp6.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;"), new gx4(1, lp6.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;"), new gx4(1, lp6.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;"), new gx4(1, lp6.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new gx4(1, lp6.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new gx4(1, lp6.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;"), new gx4(1, lp6.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;")};

    static {
        np6 np6Var = kp6.a;
        np6 np6Var2 = zo6.a;
    }

    public static void a(op6 op6Var, Function1 function1) {
        op6Var.d(zo6.a, new m3(null, function1));
    }

    public static void b(op6 op6Var, Function1 function1) {
        op6Var.d(zo6.h, new m3(null, function1));
    }

    public static final void c(op6 op6Var, qh qhVar) {
        np6 np6Var = kp6.s;
        fw3 fw3Var = a[9];
        np6Var.getClass();
        op6Var.d(np6Var, qhVar);
    }

    public static final void d(op6 op6Var, String str) {
        np6 np6Var = kp6.a;
        op6Var.d(kp6.a, qf0.K(str));
    }

    public static final void e(op6 op6Var, vb1 vb1Var) {
        np6 np6Var = kp6.a;
        np6 np6Var2 = kp6.r;
        fw3 fw3Var = a[8];
        np6Var2.getClass();
        op6Var.d(np6Var2, vb1Var);
    }

    public static final void f(op6 op6Var, pi piVar) {
        np6 np6Var = kp6.t;
        fw3 fw3Var = a[10];
        np6Var.getClass();
        op6Var.d(np6Var, piVar);
    }

    public static final void g(op6 op6Var, int i) {
        np6 np6Var = kp6.k;
        fw3 fw3Var = a[3];
        qc4 qc4Var = new qc4(i);
        np6Var.getClass();
        op6Var.d(np6Var, qc4Var);
    }

    public static final void h(op6 op6Var, String str) {
        np6 np6Var = kp6.a;
        np6 np6Var2 = kp6.d;
        fw3 fw3Var = a[2];
        np6Var2.getClass();
        op6Var.d(np6Var2, str);
    }

    public static final void i(op6 op6Var, int i) {
        np6 np6Var = kp6.z;
        fw3 fw3Var = a[14];
        pe6 pe6Var = new pe6(i);
        np6Var.getClass();
        op6Var.d(np6Var, pe6Var);
    }

    public static final void j(op6 op6Var, pw6 pw6Var) {
        np6 np6Var = kp6.a;
        np6 np6Var2 = kp6.S;
        fw3 fw3Var = a[30];
        np6Var2.getClass();
        op6Var.d(np6Var2, pw6Var);
    }

    public static final void k(op6 op6Var, xv7 xv7Var) {
        np6 np6Var = kp6.a;
        np6 np6Var2 = kp6.L;
        fw3 fw3Var = a[26];
        np6Var2.getClass();
        op6Var.d(np6Var2, xv7Var);
    }

    public static final void l(op6 op6Var) {
        np6 np6Var = kp6.n;
        fw3 fw3Var = a[6];
        Boolean bool = Boolean.TRUE;
        np6Var.getClass();
        op6Var.d(np6Var, bool);
    }
}
