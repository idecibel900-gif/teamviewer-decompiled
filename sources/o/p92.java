package o;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class p92 extends nv1 {
    public final TextView e;
    public final j92 f;
    public boolean g = true;

    public p92(TextView textView) {
        this.e = textView;
        this.f = new j92(textView);
    }

    @Override // o.nv1
    public final boolean D() {
        return this.g;
    }

    @Override // o.nv1
    public final void K(boolean z) {
        if (z) {
            TextView textView = this.e;
            textView.setTransformationMethod(O(textView.getTransformationMethod()));
        }
    }

    @Override // o.nv1
    public final void L(boolean z) {
        this.g = z;
        TextView textView = this.e;
        textView.setTransformationMethod(O(textView.getTransformationMethod()));
        textView.setFilters(y(textView.getFilters()));
    }

    @Override // o.nv1
    public final TransformationMethod O(TransformationMethod transformationMethod) {
        if (this.g) {
            return ((transformationMethod instanceof t92) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new t92(transformationMethod);
        }
        return transformationMethod instanceof t92 ? ((t92) transformationMethod).m : transformationMethod;
    }

    @Override // o.nv1
    public final InputFilter[] y(InputFilter[] inputFilterArr) {
        if (!this.g) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof j92) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            j92 j92Var = this.f;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = j92Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == j92Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
