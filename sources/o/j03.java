package o;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class j03 extends ds1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final BreakIterator f1116o;

    public j03(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f1116o = characterInstance;
    }

    @Override // o.ds1
    public final int Z(int i) {
        return this.f1116o.following(i);
    }

    @Override // o.ds1
    public final int c0(int i) {
        return this.f1116o.preceding(i);
    }
}
