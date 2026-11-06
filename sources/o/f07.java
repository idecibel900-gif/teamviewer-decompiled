package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes2.dex */
public final class f07 extends Reader {
    public final InputStream m;
    public final CharsetDecoder n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f757o;

    public f07(InputStream inputStream, Charset charset) {
        this.m = inputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.n = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) b07.s.W());
        this.f757o = byteBufferWrap;
        byteBufferWrap.flip();
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ByteBuffer byteBuffer = this.f757o;
        if (byteBuffer == null) {
            return;
        }
        b07.s.R0(byteBuffer.array());
        this.f757o = null;
        this.m.close();
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws CharacterCodingException {
        CharsetDecoder charsetDecoder;
        db8.o0(this.f757o);
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i, i2);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z = false;
        while (true) {
            ByteBuffer byteBuffer = this.f757o;
            charsetDecoder = this.n;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBufferWrap, z);
            if (coderResultDecode.isUnderflow()) {
                if (z || !charBufferWrap.hasRemaining()) {
                    break;
                }
                int iPosition = charBufferWrap.position();
                InputStream inputStream = this.m;
                if (iPosition > 0) {
                    try {
                        if (inputStream.available() <= 0) {
                            break;
                        }
                    } catch (IOException unused) {
                    }
                }
                this.f757o.compact();
                try {
                    int iPosition2 = this.f757o.position();
                    int iRemaining = inputStream.read(this.f757o.array(), this.f757o.arrayOffset() + iPosition2, this.f757o.limit() - iPosition2);
                    if (iRemaining < 0) {
                        this.f757o.flip();
                    } else {
                        if (iRemaining == 0) {
                            throw new IOException("Underlying input stream returned zero bytes");
                        }
                        this.f757o.position(iPosition2 + iRemaining);
                        this.f757o.flip();
                        iRemaining = this.f757o.remaining();
                    }
                    if (iRemaining < 0) {
                        if (charBufferWrap.position() == 0 && !this.f757o.hasRemaining()) {
                            z = true;
                            break;
                        }
                        z = true;
                    } else {
                        continue;
                    }
                } catch (Throwable th) {
                    this.f757o.flip();
                    throw th;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z) {
            charsetDecoder.reset();
        }
        if (charBufferWrap.position() == 0) {
            return z ? -1 : 0;
        }
        return charBufferWrap.position();
    }
}
