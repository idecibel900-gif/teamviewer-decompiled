package o;

import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fr1 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ TextView n;

    public /* synthetic */ fr1(TextView textView, zb0 zb0Var, byte b) {
        this.m = b;
        this.n = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        TextView textView = this.n;
        switch (b) {
            case 0:
                int i = hr1.u0;
                if (textView.getLineCount() > 1) {
                    int lineStart = textView.getLayout().getLineStart(0);
                    int lineEnd = textView.getLayout().getLineEnd(0);
                    CharSequence text = textView.getText();
                    text.getClass();
                    textView.setText(text.subSequence(lineStart, lineEnd - 1).toString() + ".");
                }
                break;
            default:
                int i2 = ht4.u0;
                if (textView.getLineCount() > 1) {
                    int lineStart2 = textView.getLayout().getLineStart(0);
                    int lineEnd2 = textView.getLayout().getLineEnd(0);
                    CharSequence text2 = textView.getText();
                    text2.getClass();
                    textView.setText(text2.subSequence(lineStart2, lineEnd2 - 1).toString() + ".");
                }
                break;
        }
    }
}
