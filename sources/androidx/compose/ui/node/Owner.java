package androidx.compose.ui.node;

import kotlin.Metadata;
import o.a10;
import o.au0;
import o.bd6;
import o.bu0;
import o.d14;
import o.de1;
import o.e42;
import o.ee8;
import o.hn5;
import o.hs4;
import o.ib5;
import o.ij3;
import o.il5;
import o.in1;
import o.ip6;
import o.iq2;
import o.ir2;
import o.j04;
import o.js7;
import o.k03;
import o.kd4;
import o.mj8;
import o.mr2;
import o.pc5;
import o.pt7;
import o.q57;
import o.u3;
import o.v00;
import o.v43;
import o.x56;
import o.z00;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner;", "", "androidx/compose/ui/node/LayoutNode", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Owner {
    u3 getAccessibilityManager();

    v00 getAutofill();

    z00 getAutofillManager();

    a10 getAutofillTree();

    au0 getClipboard();

    bu0 getClipboardManager();

    de1 getCoroutineContext();

    in1 getDensity();

    e42 getDragAndDropManager();

    iq2 getFocusOwner();

    mr2 getFontFamilyResolver();

    ir2 getFontLoader();

    k03 getGraphicsContext();

    v43 getHapticFeedBack();

    ij3 getInputModeManager();

    j04 getLayoutDirection();

    kd4 getLocaleList();

    hs4 getModifierLocalManager();

    ib5 getOutOfFrameExecutor();

    il5 getPlacementScope();

    hn5 getPointerIconService();

    x56 getRectManager();

    bd6 getRetainedValuesStore();

    LayoutNode getRoot();

    ip6 getSemanticsOwner();

    d14 getSharedDrawScope();

    boolean getShowLayoutBounds();

    pc5 getSnapshotObserver();

    q57 getSoftwareKeyboardController();

    js7 getTextInputService();

    pt7 getTextToolbar();

    ee8 getViewConfiguration();

    mj8 getWindowInfo();

    void setShowLayoutBounds(boolean z);
}
