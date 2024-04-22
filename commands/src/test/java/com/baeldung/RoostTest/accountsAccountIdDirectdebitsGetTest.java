// ********RoostGPT********
/*
Test generated by RoostGPT for test ZBIO-5244 using AI Type Open AI and AI Model gpt-4

Test generated for /accounts/{AccountId}/direct-debits_get for http method type GET in rest-assured framework

RoostTestHash=93a39f7b81


*/

// ********RoostGPT********
package com.baeldung.RoostTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.json.JSONObject;
import org.json.XML;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.Arrays;

public class accountsAccountIdDirectdebitsGetTest {

	List<Map<String, String>> envList = new ArrayList<>();

	@BeforeEach
	public void setUp() {
		TestdataLoader dataloader = new TestdataLoader();
		String[] envVarsList = { "AccountId" };
		envList = dataloader.load("src/test/java/com/baeldung/RoostTest/accounts_AccountId_direct-debitsGetTest.csv",
				envVarsList);
	}

	@Test
	public void accountsAccountIdDirectdebitsGet_Test() throws JSONException {
		this.setUp();
		Integer testNumber = 1;
		for (Map<String, String> testData : envList) {
			RestAssured.baseURI = (testData.get("BASE_URL") != null && !testData.get("BASE_URL").isEmpty())
					? testData.get("BASE_URL") : "https://sandbox.ob.hsbcnet.com/mock/obie/open-banking/v3.1/aisp";

			Response responseObj = given()
				.header("x-fapi-auth-date",
						testData.get("x-fapi-auth-date") != null ? testData.get("x-fapi-auth-date") : "")
				.header("x-fapi-customer-ip-address",
						testData.get("x-fapi-customer-ip-address") != null ? testData.get("x-fapi-customer-ip-address")
								: "")
				.header("x-fapi-interaction-id",
						testData.get("x-fapi-interaction-id") != null ? testData.get("x-fapi-interaction-id") : "")
				.header("Authorization", testData.get("Authorization") != null ? testData.get("Authorization") : "")
				.header("x-customer-user-agent",
						testData.get("x-customer-user-agent") != null ? testData.get("x-customer-user-agent") : "")
				.pathParam("AccountId", testData.get("AccountId") != null ? testData.get("AccountId") : "")
				.when()
				.get("/accounts/{AccountId}/direct-debits")
				.then()
				.extract()
				.response();
			JsonPath response;
			String contentType = responseObj.getContentType();

			System.out.printf("Test Case %d: accountsAccountIdDirectdebitsGet_Test \n", testNumber++);
			System.out.println("Request: GET /accounts/{AccountId}/direct-debits");
			System.out.println("Status Code: " + responseObj.statusCode());
			if (testData.get("statusCode") != null) {
				MatcherAssert.assertThat(responseObj.statusCode(),
						equalTo(Integer.parseInt(testData.get("statusCode"))));
			}
			else {
				List<Integer> expectedStatusCodes = Arrays.asList(200, 400, 401, 403, 404, 405, 406, 429, 500);
				MatcherAssert.assertThat(responseObj.statusCode(), is(in(expectedStatusCodes)));
			}

			switch (responseObj.statusCode()) {

				case 200:

				case 400:

				case 403:

				case 500:

					MatcherAssert.assertThat(contentType, equalTo("application/json"));
					break;

			}

			if (contentType.contains("application/xml") || contentType.contains("text/xml")) {
				String xmlResponse = responseObj.asString();
				JSONObject jsonResponse = XML.toJSONObject(xmlResponse);
				JSONObject jsonData = jsonResponse.getJSONObject("xml");
				String jsonString = jsonData.toString();
				response = new JsonPath(jsonString);

			}
			else if (contentType.contains("application/json")) {
				response = responseObj.jsonPath();
			}
			else {
				System.out.println("Response content type found: " + contentType
						+ ", but RoostGPT currently only supports the following response content types: application/json,text/xml,application/xml");
				continue;
			}

			if (responseObj.statusCode() == 200) {
				System.out.println("Description: OK");

				if (response.get("Data") != null) {
					if (response.get("Data.DirectDebit") != null) {
						for (int i = 0; i < response.getList("Data.DirectDebit").size(); i++) {
							if (response.get("Data.DirectDebit[" + i + "].AccountId") != null) {
								MatcherAssert.assertThat(response.get("Data.DirectDebit[" + i + "].AccountId"),
										instanceOf(String.class));
								MatcherAssert.assertThat(
										response.getString("Data.DirectDebit[" + i + "].AccountId").length(),
										lessThanOrEqualTo(40));

								MatcherAssert.assertThat(
										response.getString("Data.DirectDebit[" + i + "].AccountId").length(),
										greaterThanOrEqualTo(1));

							}

							if (response.get("Data.DirectDebit[" + i + "].DirectDebitId") != null) {
								MatcherAssert.assertThat(response.get("Data.DirectDebit[" + i + "].DirectDebitId"),
										instanceOf(String.class));
								MatcherAssert.assertThat(
										response.getString("Data.DirectDebit[" + i + "].DirectDebitId").length(),
										lessThanOrEqualTo(40));

								MatcherAssert.assertThat(
										response.getString("Data.DirectDebit[" + i + "].DirectDebitId").length(),
										greaterThanOrEqualTo(1));

							}

							if (response.get("Data.DirectDebit[" + i + "].MandateIdentification") != null) {
								MatcherAssert.assertThat(
										response.get("Data.DirectDebit[" + i + "].MandateIdentification"),
										instanceOf(String.class));
								MatcherAssert
									.assertThat(response.getString("Data.DirectDebit[" + i + "].MandateIdentification")
										.length(), lessThanOrEqualTo(35));

								MatcherAssert
									.assertThat(response.getString("Data.DirectDebit[" + i + "].MandateIdentification")
										.length(), greaterThanOrEqualTo(1));

							}

							if (response.get("Data.DirectDebit[" + i + "].DirectDebitStatusCode") != null) {
								MatcherAssert.assertThat(
										response.get("Data.DirectDebit[" + i + "].DirectDebitStatusCode"),
										instanceOf(String.class));
								MatcherAssert.assertThat(
										response.getString("Data.DirectDebit[" + i + "].DirectDebitStatusCode"),
										anyOf(equalTo("Active"), equalTo("Inactive")));

							}

							if (response.get("Data.DirectDebit[" + i + "].Name") != null) {
								MatcherAssert.assertThat(response.get("Data.DirectDebit[" + i + "].Name"),
										instanceOf(String.class));
								MatcherAssert.assertThat(
										response.getString("Data.DirectDebit[" + i + "].Name").length(),
										lessThanOrEqualTo(70));

								MatcherAssert.assertThat(
										response.getString("Data.DirectDebit[" + i + "].Name").length(),
										greaterThanOrEqualTo(1));

							}

							if (response.get("Data.DirectDebit[" + i + "].PreviousPaymentDateTime") != null) {
								MatcherAssert.assertThat(
										response.get("Data.DirectDebit[" + i + "].PreviousPaymentDateTime"),
										instanceOf(String.class));
							}

							if (response.get("Data.DirectDebit[" + i + "].Frequency") != null) {
								MatcherAssert.assertThat(response.get("Data.DirectDebit[" + i + "].Frequency"),
										instanceOf(String.class));
								MatcherAssert.assertThat(response.getString("Data.DirectDebit[" + i + "].Frequency"),
										anyOf(equalTo("UK.OBIE.Annual"), equalTo("UK.OBIE.Daily"),
												equalTo("UK.OBIE.Fortnightly"), equalTo("UK.OBIE.HalfYearly"),
												equalTo("UK.OBIE.Monthly"), equalTo("UK.OBIE.NotKnown"),
												equalTo("UK.OBIE.Quarterly"), equalTo("UK.OBIE.Weekly")));

							}

							if (response.get("Data.DirectDebit[" + i + "].PreviousPaymentAmount") != null) {
							}

						}
						MatcherAssert.assertThat(response.getList("Data.DirectDebit"), instanceOf(List.class));

					}

				}

				if (response.get("Links") != null) {
					if (response.get("Links.Self") != null) {
						MatcherAssert.assertThat(response.get("Links.Self"), instanceOf(String.class));
					}

					if (response.get("Links.First") != null) {
						MatcherAssert.assertThat(response.get("Links.First"), instanceOf(String.class));
					}

					if (response.get("Links.Prev") != null) {
						MatcherAssert.assertThat(response.get("Links.Prev"), instanceOf(String.class));
					}

					if (response.get("Links.Next") != null) {
						MatcherAssert.assertThat(response.get("Links.Next"), instanceOf(String.class));
					}

					if (response.get("Links.Last") != null) {
						MatcherAssert.assertThat(response.get("Links.Last"), instanceOf(String.class));
					}

				}

				if (response.get("Meta") != null) {
					if (response.get("Meta.TotalPages") != null) {
						MatcherAssert.assertThat(response.get("Meta.TotalPages"), instanceOf(Integer.class));
					}

					if (response.get("Meta.FirstAvailableDateTime") != null) {
						MatcherAssert.assertThat(response.get("Meta.FirstAvailableDateTime"), instanceOf(String.class));
					}

					if (response.get("Meta.LastAvailableDateTime") != null) {
						MatcherAssert.assertThat(response.get("Meta.LastAvailableDateTime"), instanceOf(String.class));
					}

				}
			}
			if (responseObj.statusCode() == 400) {
				System.out.println("Description: Bad request");

				if (response.get("Code") != null) {
					MatcherAssert.assertThat(response.get("Code"), instanceOf(String.class));
					MatcherAssert.assertThat(response.getString("Code").length(), lessThanOrEqualTo(40));

					MatcherAssert.assertThat(response.getString("Code").length(), greaterThanOrEqualTo(1));

				}

				if (response.get("Id") != null) {
					MatcherAssert.assertThat(response.get("Id"), instanceOf(String.class));
					MatcherAssert.assertThat(response.getString("Id").length(), lessThanOrEqualTo(40));

					MatcherAssert.assertThat(response.getString("Id").length(), greaterThanOrEqualTo(1));

				}

				if (response.get("Message") != null) {
					MatcherAssert.assertThat(response.get("Message"), instanceOf(String.class));
					MatcherAssert.assertThat(response.getString("Message").length(), lessThanOrEqualTo(500));

					MatcherAssert.assertThat(response.getString("Message").length(), greaterThanOrEqualTo(1));

				}

				if (response.get("Errors") != null) {
					for (int i = 0; i < response.getList("Errors").size(); i++) {
						if (response.get("Errors[" + i + "].ErrorCode") != null) {
							MatcherAssert.assertThat(response.get("Errors[" + i + "].ErrorCode"),
									instanceOf(String.class));
							MatcherAssert.assertThat(response.getString("Errors[" + i + "].ErrorCode"), anyOf(
									equalTo("UK.OBIE.Field.Expected"), equalTo("UK.OBIE.Field.Invalid"),
									equalTo("UK.OBIE.Field.InvalidDate"), equalTo("UK.OBIE.Field.Missing"),
									equalTo("UK.OBIE.Field.Unexpected"), equalTo("UK.OBIE.Header.Invalid"),
									equalTo("UK.OBIE.Header.Missing"), equalTo("UK.OBIE.Reauthenticate"),
									equalTo("UK.OBIE.Resource.ConsentMismatch"),
									equalTo("UK.OBIE.Resource.InvalidConsentStatus"),
									equalTo("UK.OBIE.Resource.InvalidFormat"), equalTo("UK.OBIE.Resource.NotFound"),
									equalTo("UK.OBIE.Rules.AfterCutOffDateTime"),
									equalTo("UK.OBIE.Rules.DuplicateReference"), equalTo("UK.OBIE.Signature.Invalid"),
									equalTo("UK.OBIE.Signature.InvalidClaim"), equalTo("UK.OBIE.Signature.Malformed"),
									equalTo("UK.OBIE.Signature.Missing"), equalTo("UK.OBIE.Signature.MissingClaim"),
									equalTo("UK.OBIE.Signature.Unexpected"), equalTo("UK.OBIE.UnexpectedError"),
									equalTo("UK.OBIE.Unsupported.AccountIdentifier"),
									equalTo("UK.OBIE.Unsupported.AccountSecondaryIdentifier"),
									equalTo("UK.OBIE.Unsupported.Currency"), equalTo("UK.OBIE.Unsupported.Frequency"),
									equalTo("UK.OBIE.Unsupported.LocalInstrument"),
									equalTo("UK.OBIE.Unsupported.Scheme")));

						}

						if (response.get("Errors[" + i + "].Message") != null) {
							MatcherAssert.assertThat(response.get("Errors[" + i + "].Message"),
									instanceOf(String.class));
							MatcherAssert.assertThat(response.getString("Errors[" + i + "].Message").length(),
									lessThanOrEqualTo(500));

							MatcherAssert.assertThat(response.getString("Errors[" + i + "].Message").length(),
									greaterThanOrEqualTo(1));

						}

						if (response.get("Errors[" + i + "].Path") != null) {
							MatcherAssert.assertThat(response.get("Errors[" + i + "].Path"), instanceOf(String.class));
							MatcherAssert.assertThat(response.getString("Errors[" + i + "].Path").length(),
									lessThanOrEqualTo(500));

							MatcherAssert.assertThat(response.getString("Errors[" + i + "].Path").length(),
									greaterThanOrEqualTo(1));

						}

						if (response.get("Errors[" + i + "].Url") != null) {
							MatcherAssert.assertThat(response.get("Errors[" + i + "].Url"), instanceOf(String.class));
						}

					}
					MatcherAssert.assertThat(response.getList("Errors"), instanceOf(List.class));

				}
			}
			if (responseObj.statusCode() == 401) {
				System.out.println("Description: Unauthorized");
			}
			if (responseObj.statusCode() == 403) {
				System.out.println("Description: Forbidden");

				if (response.get("Code") != null) {
					MatcherAssert.assertThat(response.get("Code"), instanceOf(String.class));
					MatcherAssert.assertThat(response.getString("Code").length(), lessThanOrEqualTo(40));

					MatcherAssert.assertThat(response.getString("Code").length(), greaterThanOrEqualTo(1));

				}

				if (response.get("Id") != null) {
					MatcherAssert.assertThat(response.get("Id"), instanceOf(String.class));
					MatcherAssert.assertThat(response.getString("Id").length(), lessThanOrEqualTo(40));

					MatcherAssert.assertThat(response.getString("Id").length(), greaterThanOrEqualTo(1));

				}

				if (response.get("Message") != null) {
					MatcherAssert.assertThat(response.get("Message"), instanceOf(String.class));
					MatcherAssert.assertThat(response.getString("Message").length(), lessThanOrEqualTo(500));

					MatcherAssert.assertThat(response.getString("Message").length(), greaterThanOrEqualTo(1));

				}

				if (response.get("Errors") != null) {
					for (int i = 0; i < response.getList("Errors").size(); i++) {
						if (response.get("Errors[" + i + "].ErrorCode") != null) {
							MatcherAssert.assertThat(response.get("Errors[" + i + "].ErrorCode"),
									instanceOf(String.class));
							MatcherAssert.assertThat(response.getString("Errors[" + i + "].ErrorCode"), anyOf(
									equalTo("UK.OBIE.Field.Expected"), equalTo("UK.OBIE.Field.Invalid"),
									equalTo("UK.OBIE.Field.InvalidDate"), equalTo("UK.OBIE.Field.Missing"),
									equalTo("UK.OBIE.Field.Unexpected"), equalTo("UK.OBIE.Header.Invalid"),
									equalTo("UK.OBIE.Header.Missing"), equalTo("UK.OBIE.Reauthenticate"),
									equalTo("UK.OBIE.Resource.ConsentMismatch"),
									equalTo("UK.OBIE.Resource.InvalidConsentStatus"),
									equalTo("UK.OBIE.Resource.InvalidFormat"), equalTo("UK.OBIE.Resource.NotFound"),
									equalTo("UK.OBIE.Rules.AfterCutOffDateTime"),
									equalTo("UK.OBIE.Rules.DuplicateReference"), equalTo("UK.OBIE.Signature.Invalid"),
									equalTo("UK.OBIE.Signature.InvalidClaim"), equalTo("UK.OBIE.Signature.Malformed"),
									equalTo("UK.OBIE.Signature.Missing"), equalTo("UK.OBIE.Signature.MissingClaim"),
									equalTo("UK.OBIE.Signature.Unexpected"), equalTo("UK.OBIE.UnexpectedError"),
									equalTo("UK.OBIE.Unsupported.AccountIdentifier"),
									equalTo("UK.OBIE.Unsupported.AccountSecondaryIdentifier"),
									equalTo("UK.OBIE.Unsupported.Currency"), equalTo("UK.OBIE.Unsupported.Frequency"),
									equalTo("UK.OBIE.Unsupported.LocalInstrument"),
									equalTo("UK.OBIE.Unsupported.Scheme")));

						}

						if (response.get("Errors[" + i + "].Message") != null) {
							MatcherAssert.assertThat(response.get("Errors[" + i + "].Message"),
									instanceOf(String.class));
							MatcherAssert.assertThat(response.getString("Errors[" + i + "].Message").length(),
									lessThanOrEqualTo(500));

							MatcherAssert.assertThat(response.getString("Errors[" + i + "].Message").length(),
									greaterThanOrEqualTo(1));

						}

						if (response.get("Errors[" + i + "].Path") != null) {
							MatcherAssert.assertThat(response.get("Errors[" + i + "].Path"), instanceOf(String.class));
							MatcherAssert.assertThat(response.getString("Errors[" + i + "].Path").length(),
									lessThanOrEqualTo(500));

							MatcherAssert.assertThat(response.getString("Errors[" + i + "].Path").length(),
									greaterThanOrEqualTo(1));

						}

						if (response.get("Errors[" + i + "].Url") != null) {
							MatcherAssert.assertThat(response.get("Errors[" + i + "].Url"), instanceOf(String.class));
						}

					}
					MatcherAssert.assertThat(response.getList("Errors"), instanceOf(List.class));

				}
			}
			if (responseObj.statusCode() == 404) {
				System.out.println("Description: Not found");
			}
			if (responseObj.statusCode() == 405) {
				System.out.println("Description: Method Not Allowed");
			}
			if (responseObj.statusCode() == 406) {
				System.out.println("Description: Not Acceptable");
			}
			if (responseObj.statusCode() == 429) {
				System.out.println("Description: Too Many Requests");
			}
			if (responseObj.statusCode() == 500) {
				System.out.println("Description: Internal Server Error");

				if (response.get("Code") != null) {
					MatcherAssert.assertThat(response.get("Code"), instanceOf(String.class));
					MatcherAssert.assertThat(response.getString("Code").length(), lessThanOrEqualTo(40));

					MatcherAssert.assertThat(response.getString("Code").length(), greaterThanOrEqualTo(1));

				}

				if (response.get("Id") != null) {
					MatcherAssert.assertThat(response.get("Id"), instanceOf(String.class));
					MatcherAssert.assertThat(response.getString("Id").length(), lessThanOrEqualTo(40));

					MatcherAssert.assertThat(response.getString("Id").length(), greaterThanOrEqualTo(1));

				}

				if (response.get("Message") != null) {
					MatcherAssert.assertThat(response.get("Message"), instanceOf(String.class));
					MatcherAssert.assertThat(response.getString("Message").length(), lessThanOrEqualTo(500));

					MatcherAssert.assertThat(response.getString("Message").length(), greaterThanOrEqualTo(1));

				}

				if (response.get("Errors") != null) {
					for (int i = 0; i < response.getList("Errors").size(); i++) {
						if (response.get("Errors[" + i + "].ErrorCode") != null) {
							MatcherAssert.assertThat(response.get("Errors[" + i + "].ErrorCode"),
									instanceOf(String.class));
							MatcherAssert.assertThat(response.getString("Errors[" + i + "].ErrorCode"), anyOf(
									equalTo("UK.OBIE.Field.Expected"), equalTo("UK.OBIE.Field.Invalid"),
									equalTo("UK.OBIE.Field.InvalidDate"), equalTo("UK.OBIE.Field.Missing"),
									equalTo("UK.OBIE.Field.Unexpected"), equalTo("UK.OBIE.Header.Invalid"),
									equalTo("UK.OBIE.Header.Missing"), equalTo("UK.OBIE.Reauthenticate"),
									equalTo("UK.OBIE.Resource.ConsentMismatch"),
									equalTo("UK.OBIE.Resource.InvalidConsentStatus"),
									equalTo("UK.OBIE.Resource.InvalidFormat"), equalTo("UK.OBIE.Resource.NotFound"),
									equalTo("UK.OBIE.Rules.AfterCutOffDateTime"),
									equalTo("UK.OBIE.Rules.DuplicateReference"), equalTo("UK.OBIE.Signature.Invalid"),
									equalTo("UK.OBIE.Signature.InvalidClaim"), equalTo("UK.OBIE.Signature.Malformed"),
									equalTo("UK.OBIE.Signature.Missing"), equalTo("UK.OBIE.Signature.MissingClaim"),
									equalTo("UK.OBIE.Signature.Unexpected"), equalTo("UK.OBIE.UnexpectedError"),
									equalTo("UK.OBIE.Unsupported.AccountIdentifier"),
									equalTo("UK.OBIE.Unsupported.AccountSecondaryIdentifier"),
									equalTo("UK.OBIE.Unsupported.Currency"), equalTo("UK.OBIE.Unsupported.Frequency"),
									equalTo("UK.OBIE.Unsupported.LocalInstrument"),
									equalTo("UK.OBIE.Unsupported.Scheme")));

						}

						if (response.get("Errors[" + i + "].Message") != null) {
							MatcherAssert.assertThat(response.get("Errors[" + i + "].Message"),
									instanceOf(String.class));
							MatcherAssert.assertThat(response.getString("Errors[" + i + "].Message").length(),
									lessThanOrEqualTo(500));

							MatcherAssert.assertThat(response.getString("Errors[" + i + "].Message").length(),
									greaterThanOrEqualTo(1));

						}

						if (response.get("Errors[" + i + "].Path") != null) {
							MatcherAssert.assertThat(response.get("Errors[" + i + "].Path"), instanceOf(String.class));
							MatcherAssert.assertThat(response.getString("Errors[" + i + "].Path").length(),
									lessThanOrEqualTo(500));

							MatcherAssert.assertThat(response.getString("Errors[" + i + "].Path").length(),
									greaterThanOrEqualTo(1));

						}

						if (response.get("Errors[" + i + "].Url") != null) {
							MatcherAssert.assertThat(response.get("Errors[" + i + "].Url"), instanceOf(String.class));
						}

					}
					MatcherAssert.assertThat(response.getList("Errors"), instanceOf(List.class));

				}
			}

		}
	}

}
