package br.com.wellingtoncosta.amdk

import br.com.wellingtoncosta.amdk.repository.ColorRepositoryTesst
import br.com.wellingtoncosta.amdk.repository.UserRepositoryTest
import br.com.wellingtoncosta.amdk.viewmodel.ListColorsViewModelTest
import br.com.wellingtoncosta.amdk.viewmodel.ListUsersViewModelTest
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses

/**
 * @author wellingtoncosta on 05/02/18.
 */
@RunWith(Suite::class)
@SuiteClasses(*[
    (ColorRepositoryTesst::class),
    (UserRepositoryTest::class),
    (ListColorsViewModelTest::class),
    (ListUsersViewModelTest::class)
])
class TestSuite