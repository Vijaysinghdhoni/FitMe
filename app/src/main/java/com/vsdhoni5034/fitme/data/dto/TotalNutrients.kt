package com.vsdhoni5034.fitme.data.dto


import com.google.gson.annotations.SerializedName

data class TotalNutrients(
    @SerializedName("CA")
    val cA: CA = CA(),
    @SerializedName("CHOCDF")
    val cHOCDF: CHOCDF = CHOCDF(),
    @SerializedName("CHOCDF.net")
    val cHOCDFNet: CHOCDFNet? = CHOCDFNet(),
    @SerializedName("CHOLE")
    val cHOLE: CHOLE = CHOLE(),
    @SerializedName("ENERC_KCAL")
    val eNERCKCAL: ENERCKCAL = ENERCKCAL(),
    @SerializedName("FAMS")
    val fAMS: FAMS = FAMS(),
    @SerializedName("FAPU")
    val fAPU: FAPU = FAPU(),
    @SerializedName("FASAT")
    val fASAT: FASAT = FASAT(),
    @SerializedName("FAT")
    val fAT: FAT = FAT(),
    @SerializedName("FATRN")
    val fATRN: FATRN = FATRN(),
    @SerializedName("FE")
    val fE: FE = FE(),
    @SerializedName("FIBTG")
    val fIBTG: FIBTG = FIBTG(),
    @SerializedName("FOLAC")
    val fOLAC: FOLAC = FOLAC(),
    @SerializedName("FOLDFE")
    val fOLDFE: FOLDFE = FOLDFE(),
    @SerializedName("FOLFD")
    val fOLFD: FOLFD = FOLFD(),
    @SerializedName("K")
    val k: K = K(),
    @SerializedName("MG")
    val mG: MG = MG(),
    @SerializedName("NA")
    val nA: NA = NA(),
    @SerializedName("NIA")
    val nIA: NIA = NIA(),
    @SerializedName("P")
    val p: P = P(),
    @SerializedName("PROCNT")
    val pROCNT: PROCNT = PROCNT(),
    @SerializedName("RIBF")
    val rIBF: RIBF = RIBF(),
    @SerializedName("SUGAR")
    val sUGAR: SUGAR = SUGAR(),
    @SerializedName("SUGAR.added")
    val sUGARAdded: SUGARAdded? = SUGARAdded(),
    @SerializedName("THIA")
    val tHIA: THIA = THIA(),
    @SerializedName("TOCPHA")
    val tOCPHA: TOCPHA = TOCPHA(),
    @SerializedName("VITA_RAE")
    val vITARAE: VITARAE = VITARAE(),
    @SerializedName("VITB12")
    val vITB12: VITB12 = VITB12(),
    @SerializedName("VITB6A")
    val vITB6A: VITB6A = VITB6A(),
    @SerializedName("VITC")
    val vITC: VITC = VITC(),
    @SerializedName("VITD")
    val vITD: VITD = VITD(),
    @SerializedName("VITK1")
    val vITK1: VITK1 = VITK1(),
    @SerializedName("WATER")
    val wATER: WATER = WATER(),
    @SerializedName("ZN")
    val zN: ZN = ZN()
)