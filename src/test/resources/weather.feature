Feature: Weather API

  Scenario: Testing city coordinates
    Given city id: 524901
    When we are requesting weather data
    Then lon is 145.77
    And lat is -16.92
    And weather id is 802
    And main is "clouds"
    And description is "scattered clouds"
    And icon is "03n"
    And base is "stations"

    And weather main is:
      | temp     | 300.15 |
      | pressure | 1007   |
      | humidity | 74     |
      | temp_min | 300.15 |
      | temp_max | 300.15 |

    And weather visibility is 1000

    And wind is:
      | speed | 3.6 |
      | deg   | 160 |

    And clouds all is 40
    And weather dt is 1485790200

    And weather sys is:
      | type    | 1          |
      | id      | 8166       |
      | message | 0.2064     |
      | country | AU         |
      | sunrise | 1485720272 |
      | sunset  | 1485766550 |

    And id is 2172797
    And name is "Cairns"
    And cod is 200











