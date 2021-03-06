package command.classes.cmd;


import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;

import java.io.PrintWriter;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			
			"javax.portlet.name=commandClasses_CommandClassesPortlet",
			"mvc.command.name=delete_leave_res"
		},
		service = MVCResourceCommand.class
	)
public class ResourceExampleCMD extends BaseMVCResourceCommand {

	@Override
	protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {
		System.out.println("Resource cmd");
		PrintWriter out = resourceResponse.getWriter();
		out.println("Resource url is created by liferay");
		out.flush();
	}

}
