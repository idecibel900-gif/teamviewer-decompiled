package o;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface lm2 {
    void b(nm2 nm2Var);

    View c(int i);

    int d(int i, int i2, int i3);

    View e(int i);

    int f(View view, int i, int i2);

    int g(int i, int i2, int i3);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    void h(View view, int i, int i2, nm2 nm2Var);

    void i(View view, int i);

    boolean j();

    int k(View view);

    void setFlexLines(List list);
}
