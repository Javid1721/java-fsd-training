package actionurlexm.portlet;

import actionurlexm.constants.ActionurlexmPortletKeys;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;

/**
 * @author ustmtest21
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.actionurl",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Actionurlexm",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ActionurlexmPortletKeys.ACTIONURLEXM,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ActionurlexmPortlet extends MVCPortlet {
	@ProcessAction(name="actionMethod")
	public void actionMethod(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException, SystemException
	{
		System.out.println("action method is called......");
		
	}
}