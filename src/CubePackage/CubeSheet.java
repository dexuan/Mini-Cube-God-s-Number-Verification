package CubePackage;

class CubeSheet {
	//�൱��֮ǰC�еĺ궨��
	public static int STEP = 11;
	private char [][][] cube_sheet = new char [5040][2187][STEP];

	//���ĳ�ʼ��
	public CubeSheet()
	{
		int aIn;
	    int bIn;
	    int cIn;
	    for(aIn=0;aIn<5040;aIn++)
	    {
	        for(bIn=0;bIn<2187;bIn++)
	        {
	            for(cIn=0;cIn<STEP;cIn++)
	            cube_sheet[aIn][bIn][cIn]=0;
	        }
	    }
	    cube_sheet[0][2186][STEP-1]=2;
	    cube_sheet[0][2186][STEP-2]=2;
	}

	//����
	public int count()
	{
	    int cIn=0;
	    for(int aIn=0;aIn<5040;aIn++)
	    {
	        for(int bIn=0;bIn<2187;bIn++)
	        {
				if(cube_sheet[aIn][bIn][STEP-1]!=0)
	            {
	                cIn++;//���Ⱥſ���ȥ��
	            }
	        }
	    }
	    return cIn;
	}

	//���Ӽ�¼
	public void add(int xIn,int yIn,char[] aIn)
	{
        if(cube_sheet[xIn][yIn][STEP-1]==0)
        {
            for(int i=0;i<STEP;i++)
            {
            	cube_sheet[xIn][yIn][i]=aIn[i];
            }
        }
	}

	//����step��ֵ
	public static int getSTEP(){
		return STEP;
	}	
	
}
