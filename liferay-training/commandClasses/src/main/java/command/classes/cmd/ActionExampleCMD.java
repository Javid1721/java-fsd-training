package command.classes.cmd;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			
			"javax.portlet.name=commandClasses_CommandClassesPortlet",
			"mvc.command.name=leave_editLeave"
		},
		service = MVCActionCommand.class
	)
public class ActionExampleCMD extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		System.out.println(".......Action command");
		
	}

	

}
