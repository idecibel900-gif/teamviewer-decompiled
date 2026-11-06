package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class jn7 {
    public static final jn7 d;
    public final HashMap a = new HashMap();
    public final jn7 b;
    public final ArrayList c;

    static {
        String[] strArr = iq8.N;
        jn7 jn7Var = new jn7(null, null);
        final byte b = 5;
        jn7Var.c("http://www.w3.org/1999/xhtml", new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "dialog", "search", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "details", "menu", "plaintext", "template", "article", "main", "center", "dir", "applet", "marquee", "listing", "#root"}, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        final byte b2 = 10;
        jn7Var.c("http://www.w3.org/1999/xhtml", new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", "a", "img", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "audio", "video", "canvas", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "basefont", "bgsound", "menuitem", "data", "bdi", "s", "strike", "nobr", "ins", "del", "button", "picture", "slot", "rb"}, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b2) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        final byte b3 = 11;
        jn7Var.c("http://www.w3.org/1999/xhtml", new String[]{"title", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style"}, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b3) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        final byte b4 = 12;
        jn7Var.c("http://www.w3.org/1999/xhtml", new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"}, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b4) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        final byte b5 = 13;
        jn7Var.c("http://www.w3.org/1999/xhtml", new String[]{"pre", "plaintext", "title", "textarea", "script"}, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b5) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        final byte b6 = 0;
        jn7Var.c("http://www.w3.org/1999/xhtml", new String[]{"title", "textarea"}, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b6) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        final byte b7 = 1;
        jn7Var.c("http://www.w3.org/1999/xhtml", new String[]{"iframe", "noembed", "noframes", "script", "style", "xmp"}, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b7) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        final byte b8 = 2;
        jn7Var.c("http://www.w3.org/1999/xhtml", strArr, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b8) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        final byte b9 = 3;
        jn7Var.c("http://www.w3.org/1999/xhtml", new String[]{"button", "input", "select", "textarea", "option", "output", "progress", "meter", "img", "picture", "audio", "video", "canvas", "object", "embed", "iframe"}, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b9) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        final byte b10 = 4;
        jn7Var.c("http://www.w3.org/1998/Math/MathML", new String[]{"math"}, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b10) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        final byte b11 = 6;
        jn7Var.c("http://www.w3.org/1998/Math/MathML", new String[]{"mi", "mo", "msup", "mn", "mtext"}, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b11) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        final byte b12 = 7;
        jn7Var.c("http://www.w3.org/2000/svg", new String[]{"svg", "femerge", "femergenode"}, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b12) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        final byte b13 = 8;
        jn7Var.c("http://www.w3.org/2000/svg", new String[]{"text"}, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b13) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        final byte b14 = 9;
        jn7Var.c("http://www.w3.org/2000/svg", new String[]{"script"}, new Consumer() { // from class: o.in7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hn7 hn7Var = (hn7) obj;
                switch (b14) {
                    case 0:
                        hn7Var.g(128);
                        break;
                    case 1:
                        hn7Var.g(256);
                        break;
                    case 2:
                        hn7Var.g(512);
                        break;
                    case 3:
                        hn7Var.g(1024);
                        break;
                    case 4:
                        hn7Var.g(4);
                        break;
                    case 5:
                        hn7Var.g(4);
                        break;
                    case 6:
                        hn7Var.g(0);
                        break;
                    case 7:
                        hn7Var.g(4);
                        break;
                    case 8:
                        hn7Var.g(0);
                        break;
                    case ep1.b /* 9 */:
                        hn7Var.g(256);
                        break;
                    case ep1.c /* 10 */:
                        hn7Var.g(0);
                        break;
                    case 11:
                        hn7Var.g(8);
                        break;
                    case ep1.d /* 12 */:
                        hn7Var.g(2);
                        break;
                    default:
                        hn7Var.g(64);
                        break;
                }
            }
        });
        d = jn7Var;
    }

    public jn7(jn7 jn7Var, ArrayList arrayList) {
        this.b = jn7Var;
        this.c = arrayList;
    }

    public final void a(hn7 hn7Var) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(hn7Var);
            }
        }
        hn7Var.h();
        ((Map) this.a.computeIfAbsent(hn7Var.m, new k82((byte) 5))).put(hn7Var.n, hn7Var);
    }

    public final hn7 b(String str, String str2) {
        hn7 hn7VarB;
        hn7 hn7Var;
        db8.o0(str);
        db8.o0(str2);
        Map map = (Map) this.a.get(str2);
        if (map != null && (hn7Var = (hn7) map.get(str)) != null) {
            return hn7Var;
        }
        jn7 jn7Var = this.b;
        if (jn7Var == null || (hn7VarB = jn7Var.b(str, str2)) == null) {
            return null;
        }
        hn7 hn7VarClone = hn7VarB.clone();
        a(hn7VarClone);
        return hn7VarClone;
    }

    public final void c(String str, String[] strArr, Consumer consumer) {
        for (String str2 : strArr) {
            hn7 hn7VarB = b(str2, str);
            if (hn7VarB == null) {
                hn7VarB = new hn7(str2, str2, str);
                hn7VarB.p = 0;
                hn7VarB.g(1);
                a(hn7VarB);
            }
            consumer.accept(hn7VarB);
        }
    }

    public final hn7 d(String str, String str2, String str3, boolean z) {
        db8.o0(str);
        db8.o0(str3);
        if (str2 == null) {
            str = str.trim();
        }
        db8.l0(str);
        hn7 hn7VarB = b(str, str3);
        if (hn7VarB != null) {
            return hn7VarB;
        }
        if (str2 == null) {
            str2 = us1.I(str);
        }
        if (!z) {
            str = str2;
        }
        hn7 hn7VarB2 = b(str2, str3);
        if (hn7VarB2 == null) {
            hn7 hn7Var = new hn7(str, str2, str3);
            a(hn7Var);
            return hn7Var;
        }
        if (!z || str.equals(str2)) {
            return hn7VarB2;
        }
        hn7 hn7VarClone = hn7VarB2.clone();
        hn7VarClone.n = str;
        a(hn7VarClone);
        return hn7VarClone;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jn7) {
            return Objects.equals(this.a, ((jn7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
