package a.b.c.com.mem.vo;

import org.apache.log4j.Logger;

public class SpringMemberVO {
	private static Logger logger = Logger.getLogger(SpringMemberVO.class);
	
	private String mnum;
	private String mname;
	private String mid;
	private String mpw;
	private String mgender;
	private String mbirth;
	private String mhp;
	private String mtel;
	private String memail;
	private String mzonecode;
	private String mroadaddress;
	private String mjibunaddress;
	private String mhobby;				
	private String mmemo;
	private String mphoto;	
	private String minfo;
	private String madmin;		
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	public SpringMemberVO() {
		
	}

	public SpringMemberVO(String mnum, String mname, String mid, String mpw, String mgender, String mbirth, String mhp,
			String mtel, String memail, String mzonecode, String mroadaddress, String mjibunaddress, String mhobby,
			String mmemo, String mphoto, String minfo, String madmin, String deleteyn, String insertdate,
			String updatedate) {

		this.mnum = mnum;
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
		this.mgender = mgender;
		this.mbirth = mbirth;
		this.mhp = mhp;
		this.mtel = mtel;
		this.memail = memail;
		this.mzonecode = mzonecode;
		this.mroadaddress = mroadaddress;
		this.mjibunaddress = mjibunaddress;
		this.mhobby = mhobby;
		this.mmemo = mmemo;
		this.mphoto = mphoto;
		this.minfo = minfo;
		this.madmin = madmin;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		SpringMemberVO.logger = logger;
	}

	public String getMnum() {
		return mnum;
	}

	public void setMnum(String mnum) {
		this.mnum = mnum;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpw() {
		return mpw;
	}

	public void setMpw(String mpw) {
		this.mpw = mpw;
	}

	public String getMgender() {
		return mgender;
	}

	public void setMgender(String mgender) {
		this.mgender = mgender;
	}

	public String getMbirth() {
		return mbirth;
	}

	public void setMbirth(String mbirth) {
		this.mbirth = mbirth;
	}

	public String getMhp() {
		return mhp;
	}

	public void setMhp(String mhp) {
		this.mhp = mhp;
	}

	public String getMtel() {
		return mtel;
	}

	public void setMtel(String mtel) {
		this.mtel = mtel;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getMzonecode() {
		return mzonecode;
	}

	public void setMzonecode(String mzonecode) {
		this.mzonecode = mzonecode;
	}

	public String getMroadaddress() {
		return mroadaddress;
	}

	public void setMroadaddress(String mroadaddress) {
		this.mroadaddress = mroadaddress;
	}

	public String getMjibunaddress() {
		return mjibunaddress;
	}

	public void setMjibunaddress(String mjibunaddress) {
		this.mjibunaddress = mjibunaddress;
	}

	public String getMhobby() {
		return mhobby;
	}

	public void setMhobby(String mhobby) {
		this.mhobby = mhobby;
	}

	public String getMmemo() {
		return mmemo;
	}

	public void setMmemo(String mmemo) {
		this.mmemo = mmemo;
	}

	public String getMphoto() {
		return mphoto;
	}

	public void setMphoto(String mphoto) {
		this.mphoto = mphoto;
	}

	public String getMinfo() {
		return minfo;
	}

	public void setMinfo(String minfo) {
		this.minfo = minfo;
	}

	public String getMadmin() {
		return madmin;
	}

	public void setMadmin(String madmin) {
		this.madmin = madmin;
	}

	public String getDeleteyn() {
		return deleteyn;
	}

	public void setDeleteyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}

	public String getInsertdate() {
		return insertdate;
	}

	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	// ???????????? ??????
	public static void printVO(SpringMemberVO mvo) {
		logger.info("SpringMemberVO ????????? ?????? ?????? >>>");
		
		logger.info("???????????? >>> : " + mvo.getMnum());
		logger.info("???????????? >>> : " + mvo.getMname());
		logger.info("????????? >>> : " + mvo.getMid());
		logger.info("???????????? >>> : " + mvo.getMpw());
		logger.info("?????? >>> : " + mvo.getMgender());
		logger.info("???????????? >>> : " + mvo.getMbirth());
		logger.info("????????? >>> : " + mvo.getMhp());
		logger.info("???????????? >>> : " + mvo.getMtel());
		logger.info("????????? >>> : " + mvo.getMemail());
		logger.info("????????????(?????????) >>> : " + mvo.getMzonecode());
		logger.info("??????(?????????) >>> : " + mvo.getMroadaddress());
		logger.info("??????(??????) >>> : " + mvo.getMjibunaddress());
		logger.info("?????? >>> : " + mvo.getMhobby());
		logger.info("???????????? >>> : " + mvo.getMphoto());
		logger.info("????????? >>> : " + mvo.getMinfo());
		logger.info("????????? >>> : " + mvo.getMadmin());
		logger.info("???????????? >>> : " + mvo.getDeleteyn());
		logger.info("????????? >>> : " + mvo.getInsertdate());
		logger.info("????????? >>> : " + mvo.getUpdatedate());
		
		logger.info("SpringMemberVO ????????? ?????? ??? >>> : ");
	}
}
