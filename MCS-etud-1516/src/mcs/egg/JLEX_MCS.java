package mcs.egg;
import mg.egg.eggc.runtime.libjava.lex.*;

public class JLEX_MCS implements  LEX_ANALYZER  {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final int YY_BOL = 256;
	private final int YY_EOF = 257;

	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yychar;
	private int yyline;
	private boolean yy_at_bol;
	private int yy_lexical_state;

	public JLEX_MCS (java.io.Reader reader) {
		this ();
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	public JLEX_MCS (java.io.InputStream instream) {
		this ();
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	public JLEX_MCS () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yychar = 0;
		yyline = 0;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
	}

	public void fromContext(LEX_CONTEXTE cont) {
		yy_reader = cont.source;
		yy_buffer = cont.buffer;
		yy_buffer_read = cont.b_read;
		yy_buffer_index = cont.b_index;
		yy_buffer_start = cont.b_start;
		yy_buffer_end = cont.b_end;
		yychar = cont.car;
		yyline = cont.ligne;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
	}
	public void toContext(LEX_CONTEXTE cont) {		cont.source = yy_reader;
		cont.buffer = yy_buffer;
		cont.b_read = yy_buffer_read;
		cont.b_index = yy_buffer_index;
		cont.b_start = yy_buffer_start;
		cont.b_end = yy_buffer_end;
		cont.ligne = yyline;
		cont.car = yychar;
	}
	public void setReader(java.io.BufferedReader r) {
		yy_reader = r;
	}
	private boolean yy_eof_done = false;
	private final int YYINITIAL = 0;
	private final int yy_state_dtrans[] = {
		0
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private int yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_end () {
		if (yy_buffer_end > yy_buffer_start &&
		    '\n' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
		if (yy_buffer_end > yy_buffer_start &&
		    '\r' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
	}
	private boolean yy_last_was_cr=false;
	private void yy_mark_start () {
		int i;
		for (i = yy_buffer_start; i < yy_buffer_index; ++i) {
			if ('\n' == yy_buffer[i] && !yy_last_was_cr) {
				++yyline;
			}
			if ('\r' == yy_buffer[i]) {
				++yyline;
				yy_last_was_cr=true;
			} else yy_last_was_cr=false;
		}
		yychar = yychar
			+ yy_buffer_index - yy_buffer_start;
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
		yy_at_bol = (yy_buffer_end > yy_buffer_start) &&
		            ('\r' == yy_buffer[yy_buffer_end-1] ||
		             '\n' == yy_buffer[yy_buffer_end-1] ||
		             2028/*LS*/ == yy_buffer[yy_buffer_end-1] ||
		             2029/*PS*/ == yy_buffer[yy_buffer_end-1]);
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
	private int[][] unpackFromString(int size1, int size2, String st) {
		int colonIndex = -1;
		String lengthString;
		int sequenceLength = 0;
		int sequenceInteger = 0;

		int commaIndex;
		String workString;

		int res[][] = new int[size1][size2];
		for (int i= 0; i < size1; i++) {
			for (int j= 0; j < size2; j++) {
				if (sequenceLength != 0) {
					res[i][j] = sequenceInteger;
					sequenceLength--;
					continue;
				}
				commaIndex = st.indexOf(',');
				workString = (commaIndex==-1) ? st :
					st.substring(0, commaIndex);
				st = st.substring(commaIndex+1);
				colonIndex = workString.indexOf(':');
				if (colonIndex == -1) {
					res[i][j]=Integer.parseInt(workString);
					continue;
				}
				lengthString =
					workString.substring(colonIndex+1);
				sequenceLength=Integer.parseInt(lengthString);
				workString=workString.substring(0,colonIndex);
				sequenceInteger=Integer.parseInt(workString);
				res[i][j] = sequenceInteger;
				sequenceLength--;
			}
		}
		return res;
	}
	private int yy_acpt[] = {
		/* 0 */ YY_NO_ANCHOR,
		/* 1 */ YY_NO_ANCHOR,
		/* 2 */ YY_NO_ANCHOR,
		/* 3 */ YY_NO_ANCHOR,
		/* 4 */ YY_NO_ANCHOR,
		/* 5 */ YY_NO_ANCHOR,
		/* 6 */ YY_NO_ANCHOR,
		/* 7 */ YY_NO_ANCHOR,
		/* 8 */ YY_NO_ANCHOR,
		/* 9 */ YY_NO_ANCHOR,
		/* 10 */ YY_NO_ANCHOR,
		/* 11 */ YY_NO_ANCHOR,
		/* 12 */ YY_NO_ANCHOR,
		/* 13 */ YY_NO_ANCHOR,
		/* 14 */ YY_NO_ANCHOR,
		/* 15 */ YY_NO_ANCHOR,
		/* 16 */ YY_NO_ANCHOR,
		/* 17 */ YY_NO_ANCHOR,
		/* 18 */ YY_NO_ANCHOR,
		/* 19 */ YY_NO_ANCHOR,
		/* 20 */ YY_NO_ANCHOR,
		/* 21 */ YY_NO_ANCHOR,
		/* 22 */ YY_NO_ANCHOR,
		/* 23 */ YY_NO_ANCHOR,
		/* 24 */ YY_NOT_ACCEPT,
		/* 25 */ YY_NO_ANCHOR,
		/* 26 */ YY_NO_ANCHOR,
		/* 27 */ YY_NO_ANCHOR,
		/* 28 */ YY_NO_ANCHOR,
		/* 29 */ YY_NO_ANCHOR,
		/* 30 */ YY_NO_ANCHOR,
		/* 31 */ YY_NO_ANCHOR,
		/* 32 */ YY_NO_ANCHOR,
		/* 33 */ YY_NO_ANCHOR,
		/* 34 */ YY_NO_ANCHOR,
		/* 35 */ YY_NO_ANCHOR,
		/* 36 */ YY_NO_ANCHOR,
		/* 37 */ YY_NO_ANCHOR,
		/* 38 */ YY_NO_ANCHOR,
		/* 39 */ YY_NO_ANCHOR,
		/* 40 */ YY_NO_ANCHOR,
		/* 41 */ YY_NO_ANCHOR,
		/* 42 */ YY_NO_ANCHOR,
		/* 43 */ YY_NO_ANCHOR,
		/* 44 */ YY_NO_ANCHOR,
		/* 45 */ YY_NO_ANCHOR,
		/* 46 */ YY_NO_ANCHOR,
		/* 47 */ YY_NO_ANCHOR,
		/* 48 */ YY_NO_ANCHOR,
		/* 49 */ YY_NO_ANCHOR,
		/* 50 */ YY_NO_ANCHOR,
		/* 51 */ YY_NO_ANCHOR,
		/* 52 */ YY_NO_ANCHOR,
		/* 53 */ YY_NO_ANCHOR,
		/* 54 */ YY_NO_ANCHOR,
		/* 55 */ YY_NO_ANCHOR,
		/* 56 */ YY_NO_ANCHOR,
		/* 57 */ YY_NO_ANCHOR,
		/* 58 */ YY_NO_ANCHOR,
		/* 59 */ YY_NO_ANCHOR,
		/* 60 */ YY_NO_ANCHOR,
		/* 61 */ YY_NO_ANCHOR,
		/* 62 */ YY_NOT_ACCEPT,
		/* 63 */ YY_NO_ANCHOR,
		/* 64 */ YY_NO_ANCHOR,
		/* 65 */ YY_NOT_ACCEPT,
		/* 66 */ YY_NO_ANCHOR,
		/* 67 */ YY_NO_ANCHOR,
		/* 68 */ YY_NO_ANCHOR,
		/* 69 */ YY_NO_ANCHOR,
		/* 70 */ YY_NO_ANCHOR,
		/* 71 */ YY_NO_ANCHOR,
		/* 72 */ YY_NO_ANCHOR,
		/* 73 */ YY_NO_ANCHOR,
		/* 74 */ YY_NO_ANCHOR,
		/* 75 */ YY_NO_ANCHOR,
		/* 76 */ YY_NO_ANCHOR,
		/* 77 */ YY_NO_ANCHOR,
		/* 78 */ YY_NO_ANCHOR,
		/* 79 */ YY_NO_ANCHOR,
		/* 80 */ YY_NO_ANCHOR,
		/* 81 */ YY_NO_ANCHOR,
		/* 82 */ YY_NO_ANCHOR,
		/* 83 */ YY_NO_ANCHOR,
		/* 84 */ YY_NO_ANCHOR,
		/* 85 */ YY_NO_ANCHOR,
		/* 86 */ YY_NO_ANCHOR,
		/* 87 */ YY_NO_ANCHOR,
		/* 88 */ YY_NO_ANCHOR,
		/* 89 */ YY_NO_ANCHOR,
		/* 90 */ YY_NO_ANCHOR,
		/* 91 */ YY_NO_ANCHOR,
		/* 92 */ YY_NO_ANCHOR,
		/* 93 */ YY_NO_ANCHOR,
		/* 94 */ YY_NO_ANCHOR,
		/* 95 */ YY_NO_ANCHOR,
		/* 96 */ YY_NO_ANCHOR,
		/* 97 */ YY_NO_ANCHOR,
		/* 98 */ YY_NO_ANCHOR,
		/* 99 */ YY_NO_ANCHOR,
		/* 100 */ YY_NO_ANCHOR,
		/* 101 */ YY_NO_ANCHOR,
		/* 102 */ YY_NO_ANCHOR,
		/* 103 */ YY_NO_ANCHOR,
		/* 104 */ YY_NO_ANCHOR,
		/* 105 */ YY_NO_ANCHOR,
		/* 106 */ YY_NO_ANCHOR,
		/* 107 */ YY_NO_ANCHOR,
		/* 108 */ YY_NO_ANCHOR,
		/* 109 */ YY_NO_ANCHOR,
		/* 110 */ YY_NO_ANCHOR,
		/* 111 */ YY_NO_ANCHOR,
		/* 112 */ YY_NO_ANCHOR,
		/* 113 */ YY_NO_ANCHOR,
		/* 114 */ YY_NO_ANCHOR,
		/* 115 */ YY_NO_ANCHOR,
		/* 116 */ YY_NO_ANCHOR,
		/* 117 */ YY_NO_ANCHOR,
		/* 118 */ YY_NO_ANCHOR,
		/* 119 */ YY_NO_ANCHOR,
		/* 120 */ YY_NO_ANCHOR,
		/* 121 */ YY_NO_ANCHOR,
		/* 122 */ YY_NO_ANCHOR,
		/* 123 */ YY_NO_ANCHOR,
		/* 124 */ YY_NO_ANCHOR,
		/* 125 */ YY_NO_ANCHOR,
		/* 126 */ YY_NO_ANCHOR,
		/* 127 */ YY_NO_ANCHOR,
		/* 128 */ YY_NO_ANCHOR,
		/* 129 */ YY_NO_ANCHOR,
		/* 130 */ YY_NO_ANCHOR,
		/* 131 */ YY_NO_ANCHOR,
		/* 132 */ YY_NO_ANCHOR,
		/* 133 */ YY_NO_ANCHOR,
		/* 134 */ YY_NO_ANCHOR,
		/* 135 */ YY_NO_ANCHOR,
		/* 136 */ YY_NO_ANCHOR,
		/* 137 */ YY_NO_ANCHOR,
		/* 138 */ YY_NO_ANCHOR,
		/* 139 */ YY_NO_ANCHOR,
		/* 140 */ YY_NO_ANCHOR,
		/* 141 */ YY_NO_ANCHOR,
		/* 142 */ YY_NO_ANCHOR
	};
	private int yy_cmap[] = unpackFromString(1,258,
"9:9,10,7,9:2,10,9:18,10,39,47,9:2,43,44,46,11,12,42,40,15,36,16,8,45:10,34," +"17,38,18,37,9:2,6:26,9:4,49,9,2,33,5,24,21,20,32,27,19,48:2,3,1,25,4,31,48," +"28,22,26,29,23,35,48,30,48,13,41,14,9:130,0:2")[0];

	private int yy_rmap[] = unpackFromString(1,143,
"0,1,2,3,4,1:8,5,1,6,7,8,9,1:3,10,11,12,1,13,1:7,13:2,1,13:3,1,13:18,14,15,1" +"6,17,18,19,20,21,22,23,20,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,4" +"0,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,6" +"5,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,9" +"0,91,92,93,13,94,95")[0];

	private int yy_nxt[][] = unpackFromString(96,50,
"1,2,90,140,91,112,59,3,4,5,3,6,7,8,9,10,11,12,13,60,127,113,141,114,140,92," +"115,140,93,128,140,142,140,116,14,140,15,16,17,18,19,61,20,21,64,22,67,69,1" +"40,5,-1:51,140,129,140:4,-1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1:7,3,-1:" +"2,3,-1:47,24,-1:59,25,-1:68,27,-1:30,28,-1:49,29,-1:49,30,-1:76,22,-1:5,23:" +"6,-1:12,23:15,-1,23,-1:9,23,-1:2,23:2,-1,24:6,36,24:42,-1,140:6,-1:12,140:1" +"5,-1,140,-1:9,140,-1:2,140:2,-1,23:5,59,-1:12,23:15,-1,23,-1:9,23,-1:2,23:2" +",-1,140:6,-1:12,140,26,140:4,68,140:8,-1,140,-1:9,140,-1:2,140:2,-1:41,31,-" +"1:54,40,-1:4,34,140:5,-1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1:44,32,-1:6" +",65:46,33,65:2,-1,140:6,-1:12,140:7,35,140:7,-1,140,-1:9,140,-1:2,140:2,-1," +"62:45,-1,62:3,-1,140:6,-1:12,140:7,37,140:7,-1,140,-1:9,140,-1:2,140:2,-1,1" +"40:6,-1:12,140:15,-1,38,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140,39,140:5,122" +",140:7,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:9,41,140:5,-1,140,-1:9" +",140,-1:2,140:2,-1,140:6,-1:12,140:2,42,140:12,-1,140,-1:9,140,-1:2,140:2,-" +"1,140:6,-1:12,140:5,43,140:9,-1,140,-1:9,140,-1:2,140:2,-1,140:2,44,140:3,-" +"1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:3,45,140:11,-1,14" +"0,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:2,46,140:12,-1,140,-1:9,140,-1:2,1" +"40:2,-1,140:6,-1:12,140:2,47,140:12,-1,140,-1:9,140,-1:2,140:2,-1,140:2,48," +"140:3,-1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:3,49,140:1" +"1,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:2,50,140:12,-1,140,-1:9,140" +",-1:2,140:2,-1,140:6,-1:12,140:13,51,140,-1,140,-1:9,140,-1:2,140:2,-1,140:" +"4,52,140,-1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:7,53,14" +"0:7,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:6,54,140:8,-1,140,-1:9,14" +"0,-1:2,140:2,-1,140:4,55,140,-1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1,140" +":6,-1:12,140,56,140:13,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:2,57,1" +"40:12,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:2,58,140:12,-1,140,-1:9" +",140,-1:2,140:2,-1,140:6,-1:12,140:3,63,140:11,-1,140,-1:9,140,-1:2,140:2,-" +"1,140:6,-1:12,140:10,66,140:4,-1,140,-1:9,140,-1:2,140:2,-1,140,131,140:4,-" +"1:12,140:2,70,140:7,97,140:4,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:" +"2,71,140:12,-1,140,-1:9,140,-1:2,140:2,-1,140,72,140:4,-1:12,140:15,-1,140," +"-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:3,73,140:11,-1,140,-1:9,140,-1:2,140" +":2,-1,140:6,-1:12,74,140:14,-1,140,-1:9,140,-1:2,140:2,-1,140:2,75,140:3,-1" +":12,140:15,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,76,140:14,-1,140,-1:9," +"140,-1:2,140:2,-1,140:6,-1:12,140:10,77,140:4,-1,140,-1:9,140,-1:2,140:2,-1" +",140:6,-1:12,140:3,78,140:11,-1,140,-1:9,140,-1:2,140:2,-1,140:3,79,140:2,-" +"1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:3,80,140:11,-1,14" +"0,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:3,81,140:11,-1,140,-1:9,140,-1:2,1" +"40:2,-1,140:6,-1:12,140:6,82,140:8,-1,140,-1:9,140,-1:2,140:2,-1,140:3,83,1" +"40:2,-1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1,140:4,84,140,-1:12,140:15,-" +"1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:9,85,140:5,-1,140,-1:9,140,-1:" +"2,140:2,-1,140:6,-1:12,86,140:14,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12," +"140:2,87,140:12,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:7,88,140:7,-1" +",140,-1:9,140,-1:2,140:2,-1,140:4,89,140,-1:12,140:15,-1,140,-1:9,140,-1:2," +"140:2,-1,140:2,117,140:3,-1:12,140:8,94,140:6,-1,140,-1:9,140,-1:2,140:2,-1" +",140:2,95,140:3,-1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1,140:3,96,140:2,-" +"1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:8,98,99,140,132,1" +"40:3,-1,140,-1:9,140,-1:2,140:2,-1,140,100,140,101,140:2,-1:12,140:15,-1,14" +"0,-1:9,140,-1:2,140:2,-1,140,102,140:4,-1:12,140:15,-1,140,-1:9,140,-1:2,14" +"0:2,-1,140:2,103,140:3,-1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:" +"12,104,140:14,-1,140,-1:9,140,-1:2,140:2,-1,140:2,105,140:3,-1:12,140:15,-1" +",140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:10,106,140:4,-1,140,-1:9,140,-1" +":2,140:2,-1,140:6,-1:12,140:10,107,140:4,-1,140,-1:9,140,-1:2,140:2,-1,140:" +"2,108,140:3,-1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:5,10" +"9,140:9,-1,140,-1:9,140,-1:2,140:2,-1,140,110,140:4,-1:12,140:15,-1,140,-1:" +"9,140,-1:2,140:2,-1,140,111,140:4,-1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-" +"1,140,118,140:4,-1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:" +"3,119,140:11,-1,140,-1:9,140,-1:2,140:2,-1,140:2,120,140:3,-1:12,140:15,-1," +"140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:9,121,140:5,-1,140,-1:9,140,-1:2" +",140:2,-1,135,140:5,-1:12,140:15,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12," +"140:12,136,140:2,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,137,140:14,-1,14" +"0,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:14,123,-1,140,-1:9,140,-1:2,140:2," +"-1,140:6,-1:12,140:2,138,140:12,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,1" +"40:2,124,140:12,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:4,125,140:10," +"-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:3,139,140:11,-1,140,-1:9,140," +"-1:2,140:2,-1,140:6,-1:12,140:12,126,140:2,-1,140,-1:9,140,-1:2,140:2,-1,14" +"0:6,-1:12,140:7,130,140:7,-1,140,-1:9,140,-1:2,140:2,-1,140:6,-1:12,140:9,1" +"33,134,140:4,-1,140,-1:9,140,-1:2,140:2");

	public Yytoken yylex ()
		throws java.io.IOException {
		int yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			if (yy_initial && yy_at_bol) yy_lookahead = YY_BOL;
			else yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			if (YY_EOF == yy_lookahead && true == yy_initial) {

	return new Yytoken(LEX_MCS.EOF , "EOF" , yyline , yychar , yychar+1 ) ;
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_move_end();
					}
					yy_to_mark();
					switch (yy_last_accept_state) {
					
case 0:
					
	{return new Yytoken(LEX_MCS.token_identASM, yytext(), yyline, yychar, yychar+1);}
					
case -2:
					
	break;
					
case 1:
					
	
					
case -3:
					
	break;
					
case 2:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -4:
					
	break;
					
case 3:
					
	{return new Yytoken(LEX_MCS.token_separateur, yytext(), yyline, yychar, yychar+1);}
					
case -5:
					
	break;
					
case 4:
					
	{return new Yytoken(LEX_MCS.token_div, yytext(), yyline, yychar, yychar+1);}
					
case -6:
					
	break;
					
case 5:
					
	{return new Yytoken(LEX_MCS.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -7:
					
	break;
					
case 6:
					
	{return new Yytoken(LEX_MCS.token_paro, yytext(), yyline, yychar, yychar+1);}
					
case -8:
					
	break;
					
case 7:
					
	{return new Yytoken(LEX_MCS.token_parf, yytext(), yyline, yychar, yychar+1);}
					
case -9:
					
	break;
					
case 8:
					
	{return new Yytoken(LEX_MCS.token_aco, yytext(), yyline, yychar, yychar+1);}
					
case -10:
					
	break;
					
case 9:
					
	{return new Yytoken(LEX_MCS.token_acf, yytext(), yyline, yychar, yychar+1);}
					
case -11:
					
	break;
					
case 10:
					
	{return new Yytoken(LEX_MCS.token_virg, yytext(), yyline, yychar, yychar+1);}
					
case -12:
					
	break;
					
case 11:
					
	{return new Yytoken(LEX_MCS.token_pt, yytext(), yyline, yychar, yychar+1);}
					
case -13:
					
	break;
					
case 12:
					
	{return new Yytoken(LEX_MCS.token_pv, yytext(), yyline, yychar, yychar+1);}
					
case -14:
					
	break;
					
case 13:
					
	{return new Yytoken(LEX_MCS.token_affect, yytext(), yyline, yychar, yychar+1);}
					
case -15:
					
	break;
					
case 14:
					
	{return new Yytoken(LEX_MCS.token_dpts, yytext(), yyline, yychar, yychar+1);}
					
case -16:
					
	break;
					
case 15:
					
	{return new Yytoken(LEX_MCS.token_moins, yytext(), yyline, yychar, yychar+1);}
					
case -17:
					
	break;
					
case 16:
					
	{return new Yytoken(LEX_MCS.token_sup, yytext(), yyline, yychar, yychar+1);}
					
case -18:
					
	break;
					
case 17:
					
	{return new Yytoken(LEX_MCS.token_inf, yytext(), yyline, yychar, yychar+1);}
					
case -19:
					
	break;
					
case 18:
					
	{return new Yytoken(LEX_MCS.token_non, yytext(), yyline, yychar, yychar+1);}
					
case -20:
					
	break;
					
case 19:
					
	{return new Yytoken(LEX_MCS.token_plus, yytext(), yyline, yychar, yychar+1);}
					
case -21:
					
	break;
					
case 20:
					
	{return new Yytoken(LEX_MCS.token_mult, yytext(), yyline, yychar, yychar+1);}
					
case -22:
					
	break;
					
case 21:
					
	{return new Yytoken(LEX_MCS.token_mod, yytext(), yyline, yychar, yychar+1);}
					
case -23:
					
	break;
					
case 22:
					
	{return new Yytoken(LEX_MCS.token_entier, yytext(), yyline, yychar, yychar+1);}
					
case -24:
					
	break;
					
case 23:
					
	{return new Yytoken(LEX_MCS.token_identc, yytext(), yyline, yychar, yychar+1);}
					
case -25:
					
	break;
					
case 25:
					
	{return new Yytoken(LEX_MCS.token_eg, yytext(), yyline, yychar, yychar+1);}
					
case -26:
					
	break;
					
case 26:
					
	{return new Yytoken(LEX_MCS.token_si, yytext(), yyline, yychar, yychar+1);}
					
case -27:
					
	break;
					
case 27:
					
	{return new Yytoken(LEX_MCS.token_arrow, yytext(), yyline, yychar, yychar+1);}
					
case -28:
					
	break;
					
case 28:
					
	{return new Yytoken(LEX_MCS.token_supeg, yytext(), yyline, yychar, yychar+1);}
					
case -29:
					
	break;
					
case 29:
					
	{return new Yytoken(LEX_MCS.token_infeg, yytext(), yyline, yychar, yychar+1);}
					
case -30:
					
	break;
					
case 30:
					
	{return new Yytoken(LEX_MCS.token_neg, yytext(), yyline, yychar, yychar+1);}
					
case -31:
					
	break;
					
case 31:
					
	{return new Yytoken(LEX_MCS.token_ou, yytext(), yyline, yychar, yychar+1);}
					
case -32:
					
	break;
					
case 32:
					
	{return new Yytoken(LEX_MCS.token_et, yytext(), yyline, yychar, yychar+1);}
					
case -33:
					
	break;
					
case 33:
					
	{return new Yytoken(LEX_MCS.token_chaine, yytext(), yyline, yychar, yychar+1);}
					
case -34:
					
	break;
					
case 34:
					
	{return new Yytoken(LEX_MCS.token_asm, yytext(), yyline, yychar, yychar+1);}
					
case -35:
					
	break;
					
case 35:
					
	{return new Yytoken(LEX_MCS.token_out, yytext(), yyline, yychar, yychar+1);}
					
case -36:
					
	break;
					
case 36:
					
	{return new Yytoken(LEX_MCS.token_comm, yytext(), yyline, yychar, yychar+1);}
					
case -37:
					
	break;
					
case 37:
					
	{return new Yytoken(LEX_MCS.token_int, yytext(), yyline, yychar, yychar+1);}
					
case -38:
					
	break;
					
case 38:
					
	{return new Yytoken(LEX_MCS.token_new, yytext(), yyline, yychar, yychar+1);}
					
case -39:
					
	break;
					
case 39:
					
	{return new Yytoken(LEX_MCS.token_ref, yytext(), yyline, yychar, yychar+1);}
					
case -40:
					
	break;
					
case 40:
					
	{return new Yytoken(LEX_MCS.token_caractere, yytext(), yyline, yychar, yychar+1);}
					
case -41:
					
	break;
					
case 41:
					
	{return new Yytoken(LEX_MCS.token_char, yytext(), yyline, yychar, yychar+1);}
					
case -42:
					
	break;
					
case 42:
					
	{return new Yytoken(LEX_MCS.token_sinon, yytext(), yyline, yychar, yychar+1);}
					
case -43:
					
	break;
					
case 43:
					
	{return new Yytoken(LEX_MCS.token_void, yytext(), yyline, yychar, yychar+1);}
					
case -44:
					
	break;
					
case 44:
					
	{return new Yytoken(LEX_MCS.token_null2, yytext(), yyline, yychar, yychar+1);}
					
case -45:
					
	break;
					
case 45:
					
	{return new Yytoken(LEX_MCS.token_this, yytext(), yyline, yychar, yychar+1);}
					
case -46:
					
	break;
					
case 46:
					
	{return new Yytoken(LEX_MCS.token_true, yytext(), yyline, yychar, yychar+1);}
					
case -47:
					
	break;
					
case 47:
					
	{return new Yytoken(LEX_MCS.token_base, yytext(), yyline, yychar, yychar+1);}
					
case -48:
					
	break;
					
case 48:
					
	{return new Yytoken(LEX_MCS.token_bool, yytext(), yyline, yychar, yychar+1);}
					
case -49:
					
	break;
					
case 49:
					
	{return new Yytoken(LEX_MCS.token_class, yytext(), yyline, yychar, yychar+1);}
					
case -50:
					
	break;
					
case 50:
					
	{return new Yytoken(LEX_MCS.token_false, yytext(), yyline, yychar, yychar+1);}
					
case -51:
					
	break;
					
case 51:
					
	{return new Yytoken(LEX_MCS.token_using, yytext(), yyline, yychar, yychar+1);}
					
case -52:
					
	break;
					
case 52:
					
	{return new Yytoken(LEX_MCS.token_malloc, yytext(), yyline, yychar, yychar+1);}
					
case -53:
					
	break;
					
case 53:
					
	{return new Yytoken(LEX_MCS.token_struct, yytext(), yyline, yychar, yychar+1);}
					
case -54:
					
	break;
					
case 54:
					
	{return new Yytoken(LEX_MCS.token_retour, yytext(), yyline, yychar, yychar+1);}
					
case -55:
					
	break;
					
case 55:
					
	{return new Yytoken(LEX_MCS.token_public, yytext(), yyline, yychar, yychar+1);}
					
case -56:
					
	break;
					
case 56:
					
	{return new Yytoken(LEX_MCS.token_typedef, yytext(), yyline, yychar, yychar+1);}
					
case -57:
					
	break;
					
case 57:
					
	{return new Yytoken(LEX_MCS.token_private, yytext(), yyline, yychar, yychar+1);}
					
case -58:
					
	break;
					
case 58:
					
	{return new Yytoken(LEX_MCS.token_namespace, yytext(), yyline, yychar, yychar+1);}
					
case -59:
					
	break;
					
case 59:
					
	{return new Yytoken(LEX_MCS.token_identASM, yytext(), yyline, yychar, yychar+1);}
					
case -60:
					
	break;
					
case 60:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -61:
					
	break;
					
case 61:
					
	{return new Yytoken(LEX_MCS.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -62:
					
	break;
					
case 63:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -63:
					
	break;
					
case 64:
					
	{return new Yytoken(LEX_MCS.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -64:
					
	break;
					
case 66:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -65:
					
	break;
					
case 67:
					
	{return new Yytoken(LEX_MCS.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -66:
					
	break;
					
case 68:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -67:
					
	break;
					
case 69:
					
	{return new Yytoken(LEX_MCS.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -68:
					
	break;
					
case 70:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -69:
					
	break;
					
case 71:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -70:
					
	break;
					
case 72:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -71:
					
	break;
					
case 73:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -72:
					
	break;
					
case 74:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -73:
					
	break;
					
case 75:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -74:
					
	break;
					
case 76:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -75:
					
	break;
					
case 77:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -76:
					
	break;
					
case 78:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -77:
					
	break;
					
case 79:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -78:
					
	break;
					
case 80:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -79:
					
	break;
					
case 81:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -80:
					
	break;
					
case 82:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -81:
					
	break;
					
case 83:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -82:
					
	break;
					
case 84:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -83:
					
	break;
					
case 85:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -84:
					
	break;
					
case 86:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -85:
					
	break;
					
case 87:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -86:
					
	break;
					
case 88:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -87:
					
	break;
					
case 89:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -88:
					
	break;
					
case 90:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -89:
					
	break;
					
case 91:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -90:
					
	break;
					
case 92:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -91:
					
	break;
					
case 93:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -92:
					
	break;
					
case 94:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -93:
					
	break;
					
case 95:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -94:
					
	break;
					
case 96:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -95:
					
	break;
					
case 97:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -96:
					
	break;
					
case 98:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -97:
					
	break;
					
case 99:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -98:
					
	break;
					
case 100:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -99:
					
	break;
					
case 101:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -100:
					
	break;
					
case 102:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -101:
					
	break;
					
case 103:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -102:
					
	break;
					
case 104:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -103:
					
	break;
					
case 105:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -104:
					
	break;
					
case 106:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -105:
					
	break;
					
case 107:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -106:
					
	break;
					
case 108:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -107:
					
	break;
					
case 109:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -108:
					
	break;
					
case 110:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -109:
					
	break;
					
case 111:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -110:
					
	break;
					
case 112:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -111:
					
	break;
					
case 113:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -112:
					
	break;
					
case 114:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -113:
					
	break;
					
case 115:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -114:
					
	break;
					
case 116:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -115:
					
	break;
					
case 117:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -116:
					
	break;
					
case 118:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -117:
					
	break;
					
case 119:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -118:
					
	break;
					
case 120:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -119:
					
	break;
					
case 121:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -120:
					
	break;
					
case 122:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -121:
					
	break;
					
case 123:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -122:
					
	break;
					
case 124:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -123:
					
	break;
					
case 125:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -124:
					
	break;
					
case 126:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -125:
					
	break;
					
case 127:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -126:
					
	break;
					
case 128:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -127:
					
	break;
					
case 129:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -128:
					
	break;
					
case 130:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -129:
					
	break;
					
case 131:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -130:
					
	break;
					
case 132:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -131:
					
	break;
					
case 133:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -132:
					
	break;
					
case 134:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -133:
					
	break;
					
case 135:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -134:
					
	break;
					
case 136:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -135:
					
	break;
					
case 137:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -136:
					
	break;
					
case 138:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -137:
					
	break;
					
case 139:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -138:
					
	break;
					
case 140:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -139:
					
	break;
					
case 141:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -140:
					
	break;
					
case 142:
					
	{return new Yytoken(LEX_MCS.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -141:
					
	break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
						yy_mark_end();
					}
				}
			}
		}
	}
}
