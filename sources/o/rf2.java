package o;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class rf2 extends p3 {
    public final AccessibilityManager t;
    public final Chip u;
    public xg v;
    public static final Rect z = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final vv A = new vv((byte) 16);
    public static final aw B = new aw((byte) 16);
    public final Rect p = new Rect();
    public final Rect q = new Rect();
    public final Rect r = new Rect();
    public final int[] s = new int[2];
    public int w = Integer.MIN_VALUE;
    public int x = Integer.MIN_VALUE;
    public int y = Integer.MIN_VALUE;

    public rf2(Chip chip) {
        this.u = chip;
        this.t = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = be8.a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    private void s(int i) {
        int i2 = this.y;
        if (i2 == i) {
            return;
        }
        this.y = i;
        r(i, 128);
        r(i2, 256);
    }

    @Override // o.p3
    public final df6 b(View view) {
        xg xgVar = this.v;
        if (xgVar != null) {
            return xgVar;
        }
        xg xgVar2 = new xg(this, (byte) 1);
        this.v = xgVar2;
        return xgVar2;
    }

    @Override // o.p3
    public final void d(View view, g4 g4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
        this.m.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((yq0) this).C;
        accessibilityNodeInfo.setCheckable(chip.e());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        if (chip.e() || chip.isClickable()) {
            g4Var.i(chip.e() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            g4Var.i("android.view.View");
        }
        g4Var.k(chip.getText());
    }

    public final boolean j(int i) {
        if (this.x != i) {
            return false;
        }
        this.x = Integer.MIN_VALUE;
        yq0 yq0Var = (yq0) this;
        if (i == 1) {
            Chip chip = yq0Var.C;
            chip.y = false;
            chip.refreshDrawableState();
        }
        r(i, 8);
        return true;
    }

    public final g4 k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        g4 g4Var = new g4(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        g4Var.i("android.view.View");
        Rect rect = z;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        g4Var.b = -1;
        Chip chip = this.u;
        accessibilityNodeInfoObtain.setParent(chip);
        p(i, g4Var);
        if (g4Var.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            hk0.o("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.q;
        g4Var.f(rect2);
        if (rect2.equals(rect)) {
            hk0.o("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            hk0.o("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            hk0.o("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        g4Var.c = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.w == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            g4Var.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            g4Var.a(64);
        }
        boolean z2 = this.x == i;
        if (z2) {
            g4Var.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            g4Var.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z2);
        int[] iArr = this.s;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.p;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            g4Var.f(rect3);
            if (g4Var.b != -1) {
                g4 g4Var2 = new g4(AccessibilityNodeInfo.obtain());
                for (int i2 = g4Var.b; i2 != -1; i2 = g4Var2.b) {
                    g4Var2.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = g4Var2.a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    p(i2, g4Var2);
                    g4Var2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.r;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = g4Var.a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfo2.setVisibleToUser(true);
                    }
                }
            }
        }
        return g4Var;
    }

    public final boolean l(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = this.t;
        int i = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = Chip.G;
                Chip chip = ((yq0) this).C;
                if (chip.d() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i = 1;
                }
                s(i);
                return true;
            }
            if (action == 10 && this.y != Integer.MIN_VALUE) {
                s(Integer.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    public abstract void m(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:67:0x0145  */
    public final boolean n(int i, Rect rect) {
        int i2;
        Object obj;
        g4 g4Var;
        ArrayList arrayList = new ArrayList();
        m(arrayList);
        n77 n77Var = new n77(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            n77Var.c(((Integer) arrayList.get(i3)).intValue(), k(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.x;
        int iB = Integer.MIN_VALUE;
        g4 g4Var2 = i4 == Integer.MIN_VALUE ? null : (g4) ck3.u(n77Var, i4);
        vv vvVar = A;
        aw awVar = B;
        Chip chip = this.u;
        int i5 = -1;
        if (i == 1 || i == 2) {
            WeakHashMap weakHashMap = be8.a;
            boolean z2 = chip.getLayoutDirection() == 1;
            awVar.getClass();
            int i6 = n77Var.f1550o;
            ArrayList arrayList2 = new ArrayList(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList2.add((g4) n77Var.d(i7));
            }
            Collections.sort(arrayList2, new xq2(z2, vvVar));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (g4Var2 != null) {
                    size = arrayList2.indexOf(g4Var2);
                }
                int i8 = size - 1;
                obj = i8 >= 0 ? arrayList2.get(i8) : null;
            } else {
                if (i != 2) {
                    hk0.g("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (g4Var2 == null ? -1 : arrayList2.lastIndexOf(g4Var2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                i2 = 0;
            }
            g4Var = (g4) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                hk0.g("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i9 = this.x;
            if (i9 != Integer.MIN_VALUE) {
                o(i9).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        hk0.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    hk0.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            awVar.getClass();
            int i10 = n77Var.f1550o;
            Rect rect4 = new Rect();
            g4Var = null;
            for (int i11 = 0; i11 < i10; i11++) {
                g4 g4Var3 = (g4) n77Var.d(i11);
                if (g4Var3 != g4Var2) {
                    vvVar.getClass();
                    g4Var3.f(rect4);
                    if (us1.D(i, rect2, rect4)) {
                        if (!us1.D(i, rect2, rect3) || us1.q(i, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            g4Var = g4Var3;
                        } else if (!us1.q(i, rect2, rect3, rect4)) {
                            int iG = us1.G(i, rect2, rect4);
                            int iH = us1.H(i, rect2, rect4);
                            int i12 = (iH * iH) + (iG * 13 * iG);
                            int iG2 = us1.G(i, rect2, rect3);
                            int iH2 = us1.H(i, rect2, rect3);
                            if (i12 < (iH2 * iH2) + (iG2 * 13 * iG2)) {
                                rect3.set(rect4);
                                g4Var = g4Var3;
                            }
                        }
                    }
                }
            }
            i2 = 0;
        }
        g4 g4Var4 = g4Var;
        if (g4Var4 != null) {
            int i13 = n77Var.f1550o;
            for (int i14 = i2; i14 < i13; i14++) {
                if (n77Var.n[i14] == g4Var4) {
                    i5 = i14;
                    break;
                }
            }
            iB = n77Var.b(i5);
        }
        return q(iB);
    }

    public final g4 o(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.u;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        g4 g4Var = new g4(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = be8.a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        m(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            hk0.o("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            g4Var.a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return g4Var;
    }

    public abstract void p(int i, g4 g4Var);

    public final boolean q(int i) {
        int i2;
        Chip chip = this.u;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.x) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.x = i;
        yq0 yq0Var = (yq0) this;
        if (i == 1) {
            Chip chip2 = yq0Var.C;
            chip2.y = true;
            chip2.refreshDrawableState();
        }
        r(i, 8);
        return true;
    }

    public final void r(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.t.isEnabled() || (parent = (view = this.u).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            g4 g4VarO = o(i);
            accessibilityEventObtain.getText().add(g4VarO.g());
            AccessibilityNodeInfo accessibilityNodeInfo = g4VarO.a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                hk0.o("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                return;
            } else {
                accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
                accessibilityEventObtain.setSource(view, i);
                accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
            }
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
