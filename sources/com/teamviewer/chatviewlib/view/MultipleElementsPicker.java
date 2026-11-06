package com.teamviewer.chatviewlib.view;

import android.content.Context;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import java.util.Iterator;
import java.util.LinkedList;
import o.cw4;
import o.dw4;
import o.ws;

/* JADX INFO: loaded from: classes.dex */
public final class MultipleElementsPicker extends ws {
    public final LinkedList t;
    public cw4 u;
    public boolean v;
    public boolean w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipleElementsPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        attributeSet.getClass();
        this.t = new LinkedList();
    }

    public final void c() {
        cw4 cw4Var = this.u;
        if (cw4Var != null) {
            cw4Var.a("");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.t.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            sb.append((CharSequence) next);
            sb.append(", ");
        }
        String string = sb.toString();
        this.x = string.length();
        this.v = true;
        setText(string);
        this.v = false;
        this.w = true;
        setSelection(this.x);
        this.w = false;
    }

    public final int getElementsSize() {
        return this.t.size();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        if (!(parcelable instanceof dw4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        dw4 dw4Var = (dw4) parcelable;
        super.onRestoreInstanceState(dw4Var.getSuperState());
        this.x = dw4Var.m;
        LinkedList linkedList = this.t;
        linkedList.clear();
        linkedList.addAll(dw4Var.n);
        Editable text = getText();
        if (text != null) {
            int length = text.length();
            int i = this.x;
            if (length > i) {
                CharSequence charSequenceSubSequence = text.subSequence(i, text.length());
                cw4 cw4Var = this.u;
                if (cw4Var != null) {
                    cw4Var.a(charSequenceSubSequence);
                    return;
                }
                return;
            }
        }
        cw4 cw4Var2 = this.u;
        if (cw4Var2 != null) {
            cw4Var2.a("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState != null) {
            return new dw4(parcelableOnSaveInstanceState, this.x, this.t);
        }
        return null;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        LinkedList linkedList;
        int i3;
        super.onSelectionChanged(i, i2);
        if (this.w || i > this.x || (linkedList = this.t) == null || linkedList.isEmpty()) {
            return;
        }
        Iterator it = linkedList.iterator();
        it.getClass();
        int length = 0;
        do {
            i3 = length;
            if (!it.hasNext()) {
                return;
            }
            Object next = it.next();
            next.getClass();
            length += ((CharSequence) next).length() + 2;
        } while (i >= length);
        this.w = true;
        setSelection(i3, length);
        this.w = false;
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        if (this.v) {
            return;
        }
        int i4 = this.x;
        if (i >= i4) {
            CharSequence charSequenceSubSequence = charSequence.subSequence(i4, charSequence.length());
            cw4 cw4Var = this.u;
            if (cw4Var != null) {
                cw4Var.a(charSequenceSubSequence);
                return;
            }
            return;
        }
        if (i2 > i3) {
            LinkedList linkedList = this.t;
            int i5 = -1;
            if (!linkedList.isEmpty() && i <= this.x) {
                int i6 = 0;
                if (i == 0) {
                    i5 = i6;
                    break;
                }
                Iterator it = linkedList.iterator();
                int length = 0;
                while (it.hasNext()) {
                    int i7 = i6 + 1;
                    length += ((CharSequence) it.next()).length() + 2;
                    if (i < length) {
                        i5 = i6;
                        break;
                    }
                    i6 = i7;
                }
            }
            if (i5 >= 0) {
                linkedList.remove(i5);
                cw4 cw4Var2 = this.u;
                if (cw4Var2 != null) {
                    cw4Var2.c(i5);
                }
                c();
            }
        }
    }

    public final void setListener(cw4 cw4Var) {
        this.u = cw4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipleElementsPicker(Context context) {
        super(context);
        context.getClass();
        this.t = new LinkedList();
    }
}
