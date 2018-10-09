package ardi;

public class main {

	public static void main(String[] args) {
		System.out.println("------Object Kelas Kotak------");
		// membuat object dari class kotak
		kotak main = new kotak();
			
		// method setter kotak
		main.setpanjang(4.20);
		main.setlebar(3.14);
			
		// method getter kotak
		System.out.println("panjang : " + main.getpanjang());
		System.out.println("lebar : " + main.getlebar());
		System.out.println("luas : " + main.getpanjang()*main.getlebar());
		System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
		
		System.out.println("------Object Kelas mahasiswa------");
		//membuat object dari class mahasiswa
		mahasiswa mahasiswa = new mahasiswa();
		
		//method setter mahasiswa
		mahasiswa.nama = "Jumardi";
		mahasiswa.nim = "D0217508";
		mahasiswa.alamat = "Wonomulyo";
		mahasiswa.golonganDarah = "O";
		mahasiswa.status = "Mahasiswa";
		mahasiswa.tinggiBadan = "165";
		mahasiswa.beratBadan = "50";
		
		//method getter mahasiswa
		System.out.println("nama : " + mahasiswa.getnama());
		System.out.println("nim : " + mahasiswa.getnim());
		System.out.println("alamat : " + mahasiswa.getalamat());
		System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
		System.out.println("Status : " + mahasiswa.getstatus());
		System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
		System.out.println("berat badan : " + mahasiswa.getberatBadan());

		System.out.println("------Object Kelas node------");
		//membuat object dari kelas node
		node node = new node();
		
		//method setter node
		node.label = "aqua";
		node.Value = 1;
		
		//method getter node
		System.out.println("Nama Label : " + node.getlabel());
		System.out.println("jumlah label : " + node.getValue());

		System.out.println("------Object Kelas stack------");
		//membuat object dari kelas stack
		stack stack = new stack();
		
		stack.value[0] = "Jumardi";
		stack.value[1] = "aswad";
		stack.value[2]= "udin";
		stack.value[3]= "sadly";
		stack.value[4]= "subhan tarman";
		stack.value[5]= "nadra";
		stack.value[6]= "aswandi";
		stack.value[7]= "ruslan";
		stack.value[8]= "muliana";
		stack.value[9]= "yuliana";
		stack.value[10]= "marwah";
		stack.value[11]= "muhammad mohar";
		stack.value[12]= "mensi jenjaka";
		stack.value[13]= "paturusi";
		stack.value[14]= "arnoldus renaldi";
		stack.value[15]= "m jaimuddin";
		stack.value[16]= "joni";
		stack.value[17]= "mujaeni";
		stack.value[18]= "nurlina";
		stack.value[19]= "sayyidah";
		stack.value[20]= "mariani";
		stack.value[21]= "agung";
		stack.value[22]= "ali";
		stack.value[23]= "jery";
		stack.value[24]= "indra";
		stack.value[25]= "nawir";
		stack.value[26]= "yani";
		stack.value[27]= "suci";
		stack.value[28]= "pahmi";
		stack.value[29]= "hendra";
		stack.value[30]= "aco";
		stack.value[31]= "wahyu";
		stack.value[32]= "tiar";
		stack.value[33]= "dandi";
		stack.value[34]= "siska";
		stack.value[35]= "lena";
		stack.value[36]= "radsam";
		stack.value[37]= "aham";
		stack.value[38]= "adding";
		stack.value[39]= "iqbal";
		stack.value[40]= "canu";
		stack.value[41]= "aqil";
		stack.value[42]= "aidil";
		stack.value[43]= "sofyan";
		stack.value[44]= "ica";
		stack.value[45]= "panur";
		stack.value[46]= "tono";
		stack.value[47]= "nanda";
		stack.value[48]= "mardi";
		stack.value[49]= "candi";
		stack.value[50]= "palli";
		stack.value[51]= "restu";
		stack.value[52]= "emmang";
		stack.value[53]= "ical";
		stack.value[54]= "supri";
		stack.value[55]= "intan";
		stack.value[56]= "rahma";
		stack.value[57]= "paisal";
		stack.value[58]= "ikram";
		stack.value[59]= "budi";
		stack.value[60]= "fandi";
		stack.value[61]= "cappi";
		stack.value[62]= "sira";
		stack.value[63]= "devi";
		stack.value[64]= "kardi";
		stack.value[65]= "fitri";
		stack.value[66]= "ratna";
		stack.value[67]= "ahmad";
		stack.value[68]= "baddi";
		stack.value[69]= "afdi";
		stack.value[70]= "wibowo";
		stack.value[71]= "dahlan";
		stack.value[72]= "utta";
		stack.value[73]= "masita";
		stack.value[74]= "diah";
		stack.value[75]= "selvi";
		stack.value[76]= "asmadi";
		stack.value[77]= "marwati";
		stack.value[78]= "mia";
		stack.value[79]= "farhan";
		stack.value[80]= "anas";
		stack.value[81]= "erwin";
		stack.value[82]= "ewan";
		stack.value[83]= "agus";
		stack.value[84]= "awan";
		stack.value[85]= "rizky";
		stack.value[86]= "wawan";
		stack.value[87]= "rasmidin";
		stack.value[88]= "candra";
		stack.value[89]= "wahyuni";
		stack.value[90]= "mala";
		stack.value[91]= "arief";
		stack.value[92]= "murci";
		stack.value[93]= "cici";
		stack.value[94]= "irma";
		stack.value[95]= "farida";
		stack.value[96]= "icca";
		stack.value[97]= "sapri";
		stack.value[98]= "carlos";
		stack.value[99]= "edwan";
		
		stack.setvalueAt(1 ,"ardi");

		//menampilkan stack
		for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};


	}

}
