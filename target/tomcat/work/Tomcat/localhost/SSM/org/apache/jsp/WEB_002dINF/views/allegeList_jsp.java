/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-09-28 08:02:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class allegeList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("           \n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>借阅记录</title>\n");
      out.write("    <meta http-equiv-\"expires\" content-\"60\">\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("    <link href=\"style/css/style20160105.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"http://apps.bdimg.com/libs/fontawesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\"/>\n");
      out.write("   \t<link rel=\"stylesheet\" href=\"style/css/table.css\">\n");
      out.write("   \t<link rel=\"stylesheet\" href=\"style/css/bootstrap.min.css\">\n");
      out.write("   <head/>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"x-body\">\n");
      out.write("<div class=\"container\" style=\"padding-top:30px;height:100%;weight:80%;\">\n");
      out.write("\t<div class=\"content\">\n");
      out.write("\t\t<!-- Content wrapper -->\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<!--主页-->\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<!-- Table with toolbar -->\n");
      out.write("\t\t\t\t<div class=\"widget\">\n");
      out.write("\t\t\t\t\t<!--查询条件-->\n");
      out.write("\t\t\t\t\t<div class=\"well\">\n");
      out.write("\t\t\t\t\t\t<form class=\"form-inline\" role=\"form\" id=\"query\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" style=\"margin-right:10px\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>工号:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"geNumber\" id=\"geNumber\" maxlength=\"128\" placeholder=\"工号\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                            <div class=\"form-group\" style=\"margin-right:10px\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>书籍代码:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"bookId\" id=\"bookId\" maxlength=\"128\" placeholder=\"书籍代码\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" style=\"margin-right:10px\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>状态:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"state\" id=\"state\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"\"></option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"已归还\">已归还</option>\n");
      out.write("\t\t\t\t\t\t\t\t  <option value=\"未归还\">未归还</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-warning\" id=\"querybtn\">查询</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /well -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!--/数据表格-->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<table class=\"table table-striped table-bordered table-hover\" id=\"userTable\">\n");
      out.write("\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>#</th>\n");
      out.write("\t\t\t\t\t\t\t<th>工号</th>\n");
      out.write("\t\t\t\t\t\t\t<th>书籍代码</th>\n");
      out.write("\t\t\t\t\t\t\t<th>手机号</th>\n");
      out.write("\t\t\t\t\t\t\t<th>借阅时间</th>\n");
      out.write("\t\t\t\t\t\t\t<th>归还时间</th>\n");
      out.write("\t\t\t\t\t\t\t<th>描述</th>\n");
      out.write("\t\t\t\t\t\t\t<th>操作</th>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t<tfoot>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"total\" class=\"pull-left\" style=\"padding-top:20px;padding-left:10px\">&nbsp;</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pull-right\">\n");
      out.write("\t\t\t                           <ul class=\"pagination\" id=\"pagination\"></ul>\n");
      out.write("\t\t\t                        </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</tfoot>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<!--还书登记-->\n");
      out.write("\t\t\t\t<div class=\"modal fade\" id=\"dealModal\" role=\"dialog\"\n");
      out.write("\t\t\t\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">还书登记</h4>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t        <form role=\"form\" id=\"dealForm\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"well\">\n");
      out.write("                                    <div id=\"sucUpd\" class=\"alert alert-success\">\n");
      out.write("\t\t\t\t\t\t\t\t\t <button type=\"button\" class=\"close\" id=\"close\" aria-hidden=\"true\">\n");
      out.write("                                     &times;\n");
      out.write("                                     </button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong>还书成功！</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"failUpd\" class=\"alert alert-warning\">\n");
      out.write("\t\t\t\t\t\t\t\t\t <button type=\"button\" class=\"close\" id=\"close\"   aria-hidden=\"true\">\n");
      out.write("                                      &times;\n");
      out.write("                                     </button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong>还书失败！</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"alert alert-danger hide\" id=\"tipError\" style='color: white'>&nbsp;</div>\n");
      out.write("                                        <div class=\"form-group\" style=\"margin-right: 10px\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label>书籍代码:</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"bookId\" id=\"bookId\" readonly>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\" style=\"margin-right: 10px\">\n");
      out.write("                                        \t<label>书籍描述:</label><textarea rows=\"3\"\n");
      out.write("                                            class=\"form-control\" name=\"description\" id=\"description\" placeholder=\"请描述书籍是否受损，完好可不填\"></textarea>\n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-dismiss=\"modal\" id=\"cancel\">取消</button>\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-warning\" id=\"addBtn\">提交</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                         </form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /.modal-content -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /.modal -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-1\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("     <script src=\"style/js/jquery.1.10.1.min.js\"></script>\n");
      out.write("        <script src=\"style/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\"  src=\"style/lib/layui/layui.js\" ></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"style/js/xadmin.js\"></script>\n");
      out.write("        <script src=\"style/js/service.ddlist.jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("     <!-- 表单验证 -->\n");
      out.write("        <script src=\"style/js/validate/jquery.validate.min.js\"></script>\n");
      out.write("        <script src=\"style/js/validate/additional-methods.js\"></script>\n");
      out.write("\n");
      out.write("     <!-- 表格 -->\n");
      out.write("         <script type=\"text/javascript\" src=\"style/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"style/js/common1.js\"></script>\n");
      out.write("     <!-- 分页 -->\n");
      out.write("        <script src=\"style/js/jqPaginator/jqPaginator.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    //表单验证\n");
      out.write("    $.validator.setDefaults({\n");
      out.write("        debug: true\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $(document).ready(function(){\n");
      out.write("    \t//查询全部用户列表\n");
      out.write("    \tlistAllege();\n");
      out.write("    $(\"#chkAll\").click(function(){\n");
      out.write("    \tchkAll(\"chkAll\",\"chk\");\n");
      out.write("    });\n");
      out.write("    \t//查询功能\n");
      out.write("    \t$(\"#querybtn\").click(function(){\n");
      out.write("    \t\tlistAllege();\n");
      out.write("    \t});\n");
      out.write("\n");
      out.write("    });\n");
      out.write("    \tfunction listAllege(){\n");
      out.write("    \t//查询条件\n");
      out.write("    \tvar geNumber = $(\"form#query #geNumber\").val();\n");
      out.write("    \tvar bookId = $(\"form#query #bookId\").val();\n");
      out.write("    \tvar state = $(\"form#query #state\").val();\n");
      out.write("\n");
      out.write("    \t//借阅列表\n");
      out.write("    \t$.post('listRecord.do',\n");
      out.write("    \t       {\"geNumber\":geNumber,\n");
      out.write("    \t\t    \"bookId\":bookId,\n");
      out.write("    \t\t    \"state\":state\n");
      out.write("    \t       },\n");
      out.write("    \t       function(response){\n");
      out.write("    \t    \t //生成结果列表\n");
      out.write("    \t\t\t initDataTable(\"userTable\", 7, new Array(\"geNumber\",\"bookId\",\"phone\",\"lendTime\",\"backTime\",\"description\"), response.page,\n");
      out.write("    \t\t\t\t\t\t\"listRecord.do\",  {\"geNumber\":geNumber,\n");
      out.write("    \t\t\t\t\t\t    \"bookId\":bookId,\n");
      out.write("    \t\t\t\t\t\t    \"state\":state\n");
      out.write("    \t\t\t\t\t       }, false, true, true, true,true,\n");
      out.write("    \t\t\t\t\t       \"<a href='javascript:void(0)' title='处理' style='padding-right:20px' onclick='dealAllege(this)'><i class='fa fa-edit'></i></a>\"+\n");
      out.write("    \t\t\t\t\t       \"<a href='javascript:void(0)' title='删除' id='del' style='padding-right:20px' onclick='delAllege(this)'><i class='fa fa-trash'></i></a>\",\n");
      out.write("    \t\t\t\t\t       \"id\"\n");
      out.write("    \t\t\t );\n");
      out.write("    \t    \t //设置查询条件\n");
      out.write("    \t\t\t $(\"form#query #geNumber\").val(geNumber);\n");
      out.write("    \t\t\t $(\"form#query #state\").val(state);\n");
      out.write("    \t\t\t $(\"form#query #bookId\").val(bookId);\n");
      out.write("    \t       }\n");
      out.write("    \t);\n");
      out.write("    \t}\n");
      out.write("\n");
      out.write("    \t//还书登记\n");
      out.write("    \tfunction dealAllege(obj){\n");
      out.write("    \t//防止表单多次提交参数\n");
      out.write("    \tvar flag = 1;\n");
      out.write("    \t//var id =  $(obj).parent(\"td\").attr(\"id\");\n");
      out.write("    \tvar lendTime = $(obj).parent(\"td\").siblings(\"td\").eq(5).html();\n");
      out.write("    \tvar bookId = $(obj).parent(\"td\").siblings(\"td\").eq(2).html();\n");
      out.write("    \tvar geNumber = $(obj).parent(\"td\").siblings(\"td\").eq(1).html();\n");
      out.write("    \tif(lendTime!=null & lendTime!=\"\"){\n");
      out.write("    \t    alert(\"该书已归还！\");\n");
      out.write("    \t}else{\n");
      out.write("    \t   $(\"#dealForm #bookId\").val(bookId)\n");
      out.write("           $(\"label.error\").remove();\n");
      out.write("           $(\"div#dealModal #sucUpd\").hide();\n");
      out.write("           $(\"div#dealModal #failUpd\").hide();\n");
      out.write("           $(\"#dealModal\").modal('show');\n");
      out.write("\n");
      out.write("\n");
      out.write("            $(\"#dealForm\").submit(function(){\n");
      out.write("             if(flag == 1){\n");
      out.write("                 flag = 0;\n");
      out.write("                 $(\"#dealForm\").find(\":submit\").attr(\"disabled\",true);\n");
      out.write("                     if(!$(\"#dealForm\").valid()){\n");
      out.write("                     $(\"div#dealModal #sucUpd\").hide();\n");
      out.write("                     $(\"div#dealModal #failUpd\").hide();\n");
      out.write("                 }else{\n");
      out.write("                      $.ajax({ type : \"post\",\n");
      out.write("                      url : \"backBook.do\",\n");
      out.write("                      data : {\"bookId\":bookId,\"geNumber\":geNumber,\"description\":$(\"#dealForm #description\").val()},\n");
      out.write("                      async : false,\n");
      out.write("                      success : function(response){\n");
      out.write("                           if(response.tip==\"success\"){\n");
      out.write("                                $(\"div#dealModal #sucUpd\").show();\n");
      out.write("                                $(\"div#dealModal #failUpd\").hide();\n");
      out.write("                           }else{\n");
      out.write("                                 $(\"div#dealModal #failUpd\").show();\n");
      out.write("                                 $(\"div#dealModal #sucUpd\").hide();\n");
      out.write("                           }\n");
      out.write("                                 listAllege();\n");
      out.write("                                 $(\"#dealForm #description\").val(\"\");\n");
      out.write("                      }\n");
      out.write("                      });\n");
      out.write("                 return false;\n");
      out.write("                 }\n");
      out.write("             }\n");
      out.write("    \t});\n");
      out.write("    \t $(\"#dealForm\").find(\":submit\").attr(\"disabled\",false);\n");
      out.write("    \t}}\n");
      out.write("\n");
      out.write("\n");
      out.write("    \t//删除\n");
      out.write("    \tfunction delAllege(obj){\n");
      out.write("    \tvar lendTime = $(obj).parent(\"td\").siblings(\"td\").eq(5).html();\n");
      out.write("    \tif(lendTime!=null && lendTime!=\"\"){\n");
      out.write("    \tif(confirm(\"是否删除该记录\")){\n");
      out.write("            \t\t\tvar id =  $(obj).parent(\"td\").attr(\"id\");\n");
      out.write("            \t\t\t$.post(\"delRecord.do\",{\"id\":id},function(response){\n");
      out.write("                        \t\t\t\tif(response.tip==\"success\"){\n");
      out.write("                        \t\t\t\t\talert(\"删除成功\");\n");
      out.write("                        \t\t\t\t\tlistAllege();\n");
      out.write("                        \t\t\t\t}\n");
      out.write("                        \t\t\t\telse if(response.tip==\"error\"){\n");
      out.write("                        \t\t\t\t\talert(\"删除失败!\");\n");
      out.write("                        \t\t\t\t}\n");
      out.write("                        \t\t\t});\n");
      out.write("            \t\t}\n");
      out.write("    \t}else{\n");
      out.write("    \talert(\"该书未还，不可删除借书记录\");\n");
      out.write("    \t}\n");
      out.write("\n");
      out.write("    \t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}