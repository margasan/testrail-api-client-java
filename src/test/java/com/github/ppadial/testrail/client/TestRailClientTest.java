/*
 * Copyright (c) 2018. Paulino Padial
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.github.ppadial.testrail.client;

import com.github.ppadial.testrail.client.api.cases.CaseServiceClient;
import com.github.ppadial.testrail.client.api.casetypes.CaseTypeServiceClient;
import com.github.ppadial.testrail.client.api.configurations.ConfigurationServiceClient;
import com.github.ppadial.testrail.client.api.milestones.MilestoneServiceClient;
import com.github.ppadial.testrail.client.api.plans.PlanServiceClient;
import com.github.ppadial.testrail.client.api.priorities.PriorityServiceClient;
import com.github.ppadial.testrail.client.api.projects.ProjectServiceClient;
import com.github.ppadial.testrail.client.api.results.ResultServiceClient;
import com.github.ppadial.testrail.client.api.runs.RunServiceClient;
import com.github.ppadial.testrail.client.api.sections.SectionServiceClient;
import com.github.ppadial.testrail.client.api.statuses.StatusServiceClient;
import com.github.ppadial.testrail.client.api.suites.SuiteServiceClient;
import com.github.ppadial.testrail.client.api.templates.TemplateServiceClient;
import com.github.ppadial.testrail.client.api.tests.TestServiceClient;
import com.github.ppadial.testrail.client.api.users.UserServiceClient;
import com.github.ppadial.testrail.client.apiClient.ApiClient;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestRailClientTest {

  private TestRailClient testRailClient;
  @Mock private ApiClient apiClient;

  @BeforeMethod(alwaysRun=true)
  public void injectDoubles() {
    MockitoAnnotations.initMocks(this);
  }

  @BeforeMethod
  public void setUp() throws Exception {
    testRailClient = new TestRailClient(apiClient);
  }

  @Test
  public void testCaseApi() throws Exception {
    assertThat(testRailClient.caseApi()).isInstanceOf(CaseServiceClient.class);
  }

  @Test
  public void testCaseTypesApi() throws Exception {
    assertThat(testRailClient.caseTypesApi()).isInstanceOf(CaseTypeServiceClient.class);
  }

  @Test
  public void testConfigurationApi() throws Exception {
    assertThat(testRailClient.configurationApi()).isInstanceOf(ConfigurationServiceClient.class);
  }

  @Test
  public void testMilestoneApi() throws Exception {
    assertThat(testRailClient.milestoneApi()).isInstanceOf(MilestoneServiceClient.class);
  }

  @Test
  public void testPlanApi() throws Exception {
    assertThat(testRailClient.planApi()).isInstanceOf(PlanServiceClient.class);
  }

  @Test
  public void testPriorityApi() throws Exception {
    assertThat(testRailClient.priorityApi()).isInstanceOf(PriorityServiceClient.class);
  }

  @Test
  public void testProjectApi() throws Exception {
    assertThat(testRailClient.projectApi()).isInstanceOf(ProjectServiceClient.class);
  }

  @Test
  public void testResultApi() throws Exception {
    assertThat(testRailClient.resultApi()).isInstanceOf(ResultServiceClient.class);
  }

  @Test
  public void testRunApi() throws Exception {
    assertThat(testRailClient.runApi()).isInstanceOf(RunServiceClient.class);
  }

  @Test
  public void testSectionApi() throws Exception {
    assertThat(testRailClient.sectionApi()).isInstanceOf(SectionServiceClient.class);
  }

  @Test
  public void testStatusApi() throws Exception {
    assertThat(testRailClient.statusApi()).isInstanceOf(StatusServiceClient.class);
  }

  @Test
  public void testSuiteApi() throws Exception {
    assertThat(testRailClient.suiteApi()).isInstanceOf(SuiteServiceClient.class);
  }

  @Test
  public void testTemplateApi() throws Exception {
    assertThat(testRailClient.templateApi()).isInstanceOf(TemplateServiceClient.class);
  }

  @Test
  public void testTestApi() throws Exception {
    assertThat(testRailClient.testApi()).isInstanceOf(TestServiceClient.class);
  }

  @Test
  public void testUserApi() throws Exception {
    assertThat(testRailClient.userApi()).isInstanceOf(UserServiceClient.class);
  }
}